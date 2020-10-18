/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import clases.Factura;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CyberLink
 */
public class ConexionFactura {

    public ConexionFactura() {
    }

    public ObjectContainer BaseFactura() {
        ObjectContainer contenedor = Db4o.openFile("C:\\Program Files\\Colibri\\BaseFactura.yap");
        return contenedor;
    }

    public void CrearFactura(ObjectContainer basep, String cod_factura, String fecha, String num_factura, String cod_prov, String cod_prod, String nom_prod, String tip_prod, int cant, double precio_Total) {
        Factura factura = new Factura(cod_factura, fecha, num_factura, cod_prov, cod_prod, nom_prod, tip_prod, cant, precio_Total);
            basep.set(factura);
    }

    public static int ComprobarFactura(ObjectContainer basep, String cod_factura) {
        Factura factura = new Factura(cod_factura, null, null, null, null, null, null, 0, 0);
        ObjectSet resultado = basep.get(factura);
        return resultado.size();
    }

    public void Cerrarbd(ObjectContainer basep) {
        basep.close();
    }

    public boolean ConsultarFactura(ObjectContainer basep, String cod_factura) {
        Factura factura = new Factura(cod_factura, null, null, null, null, null, null, 0, 0);
        ObjectSet resultado = basep.get(factura);
        return !resultado.isEmpty();
    }

    public boolean ConsultarNumFact(ObjectContainer basep, String cod_factura) {
        Factura factura = new Factura(null, null, cod_factura, null, null, null, null, 0, 0);
        ObjectSet resultado = basep.get(factura);
        return !resultado.isEmpty();
    }
    
    public void EliminarFactura(ObjectContainer basep, String cod_factura) {
        Factura fac = new Factura(cod_factura, null, null, null, null, null, null, 0, 0);
        ObjectSet resultado = basep.get(fac);

        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "La factura no se encuentra");
        } else {
            Factura eliminar = (Factura) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "La factura fue eliminada");
        }
    }
    
    /*public void ModificarFactura(ObjectContainer basep, String cod_factura, String nombre, String apellido, String telefono, String direccion, String correo) {
        Factura proveedor = new Factura(cod_factura, null, null, null, null, null, null, 0, 0);
        ObjectSet resultado = basep.get(proveedor);
        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "La factura no se encuentra");
        } else {
            Factura modificar = (Factura) resultado.next();
            modificar.setNombre(nombre);
            modificar.setApellido(apellido);
            modificar.setTelefono(telefono);
            modificar.setDireccion(direccion);
            modificar.setCorreo(correo);
            JOptionPane.showMessageDialog(null, "La factura fue modificada");
            basep.set(modificar);
        }
    }*/

    public Factura[] ConsultarFact(Factura objeto) {
        Factura[] prov = null;
        ObjectContainer base = BaseFactura();
        ObjectSet resultados = base.get(objeto);
        int i = 0;
        if (resultados.hasNext()) {
            prov = new Factura[resultados.size()];
            while (resultados.hasNext()) {
                prov[i] = (Factura) resultados.next();
                i++;
            }
        }
        Cerrarbd(base);
        return prov;
    }

    public DefaultTableModel Factura() {
        String titulos[] = {"Codigo", "Fecha", "Numero factura", "Proveedor", "Producto", "Nombre", "Tipo", "Cantidad", "Precio"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        Factura prov = null;
        Factura[] p = ConsultarFact(prov);
        if (p != null) {
            for (Factura pro : p) {
                Object[] cli = new Object[9];
                cli[0] = pro.getCod_factura();
                cli[1] = pro.getFecha();
                cli[2] = pro.getNum_factura();
                cli[3] = pro.getCod_prov();
                cli[4] = pro.getCod_prod();
                cli[5] = pro.getNom_prod();
                cli[6] = pro.getTip_prod();
                cli[7] = pro.getCant();
                cli[8] = pro.getPrecio_Total();
                dtm.addRow(cli);
            }
        }
        return dtm;
    }

    public String Codigo(ObjectContainer basep) {
        int generar = 0;
        boolean confirmar;
        String codigo;
        generar++;
        codigo = generar + "";
        do {
            if (ConsultarFactura(basep, codigo) != false) {
                generar++;
                codigo = generar + "";
                confirmar = false;
            } else {
                confirmar = true;
            }
        } while (confirmar != true);
        return codigo;
    }

    public String Facture(ObjectContainer basep) {
        int numFactura = 0;
        String codigo;
        boolean confirmar;
        numFactura++;
        codigo = generar(numFactura);
        do {
            if (ConsultarNumFact(basep, codigo) != false) {
                numFactura++;
                codigo = generar(numFactura);
                confirmar = false;
            } else {
                confirmar = true;
            }
        } while (confirmar != true);
        return codigo;
    }

    private String generar(int num) {
        String cod;
        if (num < 10) {
            cod = "00" + num;
            return cod;
        } else {
            if (num < 100) {
                cod = "0" + num;
                return cod;
            } else {
                cod = num + "";
                return cod;
            }
        }
    }
}
