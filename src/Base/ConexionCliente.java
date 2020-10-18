/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import clases.Cliente;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 2
 */
public class ConexionCliente {

    public ConexionCliente() {
    }

    public ObjectContainer BaseCliente() {
        ObjectContainer contenedor = Db4o.openFile("C:\\Program Files\\Colibri\\BaseCliente.yap");
        return contenedor;
    }

    public void CrearCliente(ObjectContainer basep, String ID, String nombre, String apellido, String telefono, String direccion, String correo) {
        Cliente cliente = new Cliente(ID, nombre, apellido, telefono, direccion, correo);
        if (ComprobarCliente(basep, ID) != 0) {
            JOptionPane.showMessageDialog(null, "Registro Existente");
        } else {
            basep.set(cliente);
            JOptionPane.showMessageDialog(null, "Registro Guardado");
        }
    }

    public static int ComprobarCliente(ObjectContainer basep, String ID) {
        Cliente cliente = new Cliente(ID, null, null, null, null, null);
        ObjectSet resultado = basep.get(cliente);
        return resultado.size();
    }

    public void Cerrarbd(ObjectContainer basep) {
        basep.close();
    }

    public boolean ConsultarCliente(ObjectContainer basep, String ID) {
        Cliente cliente = new Cliente(ID, null, null, null, null, null);
        ObjectSet resultado = basep.get(cliente);
        return !resultado.isEmpty();
    }

    public void EliminarCliente(ObjectContainer basep, String ID) {
        Cliente cli = new Cliente(ID, null, null, null, null, null);
        ObjectSet resultado = basep.get(cli);

        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Cliente no se encuentra");
        } else {
            Cliente eliminar = (Cliente) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "El Cliente fue eliminado");
        }
    }

    public void ModificarCliente(ObjectContainer basep, String ID_proveedor, String nombre, String apellido, String telefono, String direccion, String correo) {
        Cliente proveedor = new Cliente(ID_proveedor, null, null, null, null, null);
        ObjectSet resultado = basep.get(proveedor);
        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Cliente no se encuentra");
        } else {
            Cliente modificar = (Cliente) resultado.next();
            modificar.setNombre(nombre);
            modificar.setApellido(apellido);
            modificar.setTelefono(telefono);
            modificar.setDireccion(direccion);
            modificar.setCorreo(correo);
            JOptionPane.showMessageDialog(null, "El cliente fue modificado");
            basep.set(modificar);
        }
    }

    public Cliente[] ConsultarClien(Cliente objeto) {
        Cliente[] producto = null;
        ObjectContainer base = BaseCliente();
        ObjectSet resultados = base.get(objeto);
        int i = 0;
        if (resultados.hasNext()) {
            producto = new Cliente[resultados.size()];
            while (resultados.hasNext()) {
                producto[i] = (Cliente) resultados.next();
                i++;
            }
        }
        Cerrarbd(base);
        return producto;
    }

    public DefaultTableModel Cliente() {
        String titulos[] = {"Cedula", "Nombre", "Apellido", "Telefono", "Direccion", "Correo"};
        DefaultTableModel dtm = new DefaultTableModel(null, titulos);
        Cliente producto = null;
        Cliente[] p = ConsultarClien(producto);
        if (p != null) {
            for (Cliente pro : p) {
                Object[] cli = new Object[6];
                cli[0] = pro.getCedula();
                cli[1] = pro.getNombre();
                cli[2] = pro.getApellido();
                cli[3] = pro.getTelefono();
                cli[4] = pro.getDireccion();
                cli[5] = pro.getCorreo();
                dtm.addRow(cli);
            }
        }
        return dtm;
    }

}
