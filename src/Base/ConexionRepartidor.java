/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;


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
        ObjectContainer contenedor = Db4o.openFile("C:\\Users\\PC\\Desktop\\Base\\BaseRepartidor.yap");
        return contenedor;
    }

    public void CrearRepartidor(ObjectContainer basep, String ID, String nombre, String apellido, String telefono, String direccion, String num_placa) {
        Repartidor rep = new Repartidor(ID, nombre, apellido, telefono, direccion, num_placa);
        if (ComprobarRepartidor(basep, nombre, ID) != 0) {
            JOptionPane.showMessageDialog(null, "Registro Existente");
        } else {
            basep.set(rep);
            JOptionPane.showMessageDialog(null, "Registro Guardado");
        }
    }

    public static int ComprobarRepartidor(ObjectContainer basep, String nombre, String ID) {
        Repartidor rep = new Repartidor(ID, null, null, null, null, null);
        ObjectSet resultado = basep.get(rep);
        return resultado.size();
    }

    public static int CompRepartAleat(ObjectContainer basep) {
        Repartidor rep = new Repartidor(null, null, null, null, null, null);
        ObjectSet resultado = basep.get(rep);
        return resultado.size();
    }

    public void Cerrarbd(ObjectContainer basep) {
        basep.close();
    }

    public boolean ConsultarRepartidor(ObjectContainer basep, String cedula) {
        Repartidor rep = new Repartidor(cedula, null, null, null, null, null);
        ObjectSet resultado = basep.get(rep);
        return !resultado.isEmpty();
    }

    public Repartidor[] ConsultarRep(Repartidor objeto) {
        Repartidor[] repa = null;
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

    public void Eliminarrepartidor(ObjectContainer basep, String ID) {
        Repartidor rep = new Repartidor(ID, null, null, null, null, null);
        ObjectSet resultado = basep.get(rep);

        if (resultado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El CLiente no se encuentra");
        } else {
            Repartidor eliminar = (Repartidor) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "El Cliente fue eliminado");
        }
    }
    
    public void ModificarRepartidor(ObjectContainer basep, String id, String nombre, String apellido, String telefono, String direccion, String num_placa) {
        Repartidor proveedor = new Repartidor(id, null, null, null, null, null);
        ObjectSet resultado = basep.get(proveedor);
        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Cliente no se encuentra");
        } else {
            Repartidor modificar = (Repartidor) resultado.next();
            modificar.setNombre(nombre);
            modificar.setApellido(apellido);
            modificar.setTelefono(telefono);
            modificar.setDireccion(direccion);
            modificar.setNum_placa_moto(num_placa);
            JOptionPane.showMessageDialog(null, "El repartidor fue modificado");
            basep.set(modificar);
        }
    }

    public DefaultTableModel Repartidor() {
        String titulos[] = {"Cédula", "Nombre", "Apellido", "Teléfono", "Dirección", "N° Placa"};
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

    public int Aleatorio(ObjectContainer base) {
        int max;
        int aleat=0;
        if (CompRepartAleat(base)==0) {
            JOptionPane.showMessageDialog(null, "no existe repartidores");
        }else{
            max=CompRepartAleat(base)-1;
            aleat=(int) Math.floor(Math.random() * max + 0);
        }
        System.out.println(aleat);
        return aleat;
    }

}
