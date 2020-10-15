/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import clases.Proveedor;
import clases.Repartidor;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ConexionRepartidor {
    
    
    public ConexionRepartidor() {
    }

    public ObjectContainer BaseRepartidor() {
        ObjectContainer contenedor = Db4o.openFile("C:\\Users\\PC\\Desktop\\RepositorioColibriFinal\\Base\\BaseRepartidor.yap");
        return contenedor;
    }

    public void CrearRepartidor(ObjectContainer basep, String ID, String nombre, String apellido, String telefono, String direccion, String num_placa) {
        Repartidor rep = new Repartidor(ID, nombre, apellido, telefono, direccion,num_placa);
        if (ComprobarRepartidor(basep, nombre, ID) != 0) {
            JOptionPane.showMessageDialog(null, "Registro Existente");
        } else {
            basep.set(rep);
            JOptionPane.showMessageDialog(null, "Registro Guardado");
        }
    }

    public static int ComprobarRepartidor(ObjectContainer basep, String nombre, String ID) {
        Repartidor rep = new Repartidor( ID, null, null, null, null, null);
        ObjectSet resultado = basep.get(rep);
        return resultado.size();
    }

    public void Cerrarbd(ObjectContainer basep) {
        basep.close();
    }

    public boolean ConsultarRepartidor(ObjectContainer basep, String cedula) {
        Repartidor rep = new Repartidor(cedula, null, null, null, null,null);
        ObjectSet resultado = basep.get(rep);
        return !resultado.isEmpty();
    }

    public Repartidor[] ConsultarRep(Repartidor objeto) {
        Repartidor [] repa = null;
        ObjectContainer base = BaseRepartidor();
        ObjectSet resultados = base.get(objeto);
        int i = 0;
        if (resultados.hasNext()) {
            repa = new Repartidor[resultados.size()];
            while (resultados.hasNext()) {
                repa[i] = (Repartidor) resultados.next();
                i++;
            }
        }
        Cerrarbd(base);
        return repa;
    }
    
    public void EliminarRepartidor(ObjectContainer basep, String ID_repartidor) {
        Repartidor rep = new Repartidor(ID_repartidor, null, null, null, null, null);
        ObjectSet resultado = basep.get(rep);

        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Repartidor no se encuentra");
        } else {
            Repartidor eliminar = (Repartidor) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "El Repartidor fue eliminado");
        }
    }

    public DefaultTableModel Repartidor() {
        String titulos[] = { "Cédula", "Nombre", "Apellido", "Teléfono", "Dirección","N° Placa"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        Repartidor repartidor = null;
        Repartidor[] p = ConsultarRep(repartidor);
        if (p != null) {
            for (Repartidor repar : p) {
                Object[] cli = new Object[6];
                cli[0] = repar.getCedula();
                cli[1] = repar.getNombre();
                cli[2] = repar.getApellido();
                cli[3] = repar.getTelefono();
                cli[4] = repar.getDireccion();
                cli[5] = repar.getNum_placa_moto();
                dtm.addRow(cli);
            }
        }
        return dtm;
    }

  

}
