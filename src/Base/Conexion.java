package Base;

import clases.Cliente;
import clases.Proveedor;
import clases.Repartidor;
import javax.swing.JOptionPane;
import com.db4o.*;

/**
 *
 * @author grupo2
 */
public class Conexion {

    //cliente
    public ObjectContainer BaseCliente() {
        ObjectContainer contenedor = Db4o.openFile("C:\\Program Files\\Base\\BaseCliente\\Base.yap");
        return contenedor;
    }

    public ObjectContainer BaseProveedor() {
        ObjectContainer contenedor = Db4o.openFile("C:\\Program Files\\Base\\BaseProveedor\\Base.yap");
        return contenedor;
    }

    public ObjectContainer BaseRepartidor() {
        ObjectContainer contenedor = Db4o.openFile("C:\\Program Files\\Base\\BaseRepartidor\\Base.yap");
        return contenedor;
    }

    public void CrearCLiente(ObjectContainer basep, String ID_cliente, String correo, String ID, String nombre, String apellido, String telefono, String direccion) {
        Cliente cliente = new Cliente(ID_cliente, correo, ID, nombre, apellido, telefono, direccion);
        if (ComprobarCliente(basep, ID_cliente) != 0) {
            JOptionPane.showMessageDialog(null, "Registro Existente");
        } else {
            basep.set(cliente);
            JOptionPane.showMessageDialog(null, "Registro Guardado");
        }

    }

    public static int ComprobarCliente(ObjectContainer basep, String ID_cliente) {
        Cliente cliente = new Cliente(ID_cliente, null, null, null, null, null, null);
        ObjectSet resultado = basep.get(cliente);
        return resultado.size();
    }

    public boolean ConsultarCliente(ObjectContainer basep, String ID_cliente) {
        Cliente cliente = new Cliente(ID_cliente, null, null, null, null, null, null);
        ObjectSet resultado = basep.get(cliente);
        if (resultado.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void EliminarCliente(ObjectContainer basep, String ID_cliente) {
        Cliente cliente = new Cliente(ID_cliente, null, null, null, null, null, null);
        ObjectSet resultado = basep.get(cliente);

        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Cliente no se encuentra");
        } else {
            Cliente eliminar = (Cliente) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "El cliente fue eliminado");
        }
    }

    public void ModificarCliente(ObjectContainer basep, String ID_cliente, String correo, String ID, String nombre, String apellido, String telefono, String direccion) {
        Cliente cliente = new Cliente(ID_cliente, null, null, null, null, null, null);
        ObjectSet resultado = basep.get(cliente);
        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Cliente no se encuentra");
        } else {
            Cliente modificar = (Cliente) resultado.next();
            modificar.setNombre(nombre);
            modificar.setApellido(apellido);
            modificar.setCorreo(correo);
            modificar.setDireccion(direccion);
            modificar.setTelefono(telefono);
            JOptionPane.showMessageDialog(null, "El Cliente fue modificado");
            basep.set(modificar);
        }
    }

    //proveedor
    public void CrearProveedor(ObjectContainer basep, String ID_proveedor, String ID, String nombre, String apellido, String telefono, String direccion) {
        Proveedor proveedor = new Proveedor(ID_proveedor, ID, nombre, apellido, telefono, direccion);
        if (ComprobarProveedor(basep, ID_proveedor) != 0) {
            JOptionPane.showMessageDialog(null, "Registro Existente");
        } else {
            basep.set(proveedor);
            JOptionPane.showMessageDialog(null, "Registro Guardado");
        }

    }

    public static int ComprobarProveedor(ObjectContainer basep, String ID_proveedor) {
        Proveedor proveedor = new Proveedor(ID_proveedor, null, null, null, null, null);
        ObjectSet resultado = basep.get(proveedor);
        return resultado.size();
    }

    public boolean ConsultarProveedor(ObjectContainer basep, String ID_proveedor) {
        Proveedor proveedor = new Proveedor(ID_proveedor, null, null, null, null, null);
        ObjectSet resultado = basep.get(proveedor);
        if (resultado.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void EliminarProveedor(ObjectContainer basep, String ID_proveedor) {
        Proveedor proveedor = new Proveedor(ID_proveedor, null, null, null, null, null);
        ObjectSet resultado = basep.get(proveedor);

        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Proveedor no se encuentra");
        } else {
            Cliente eliminar = (Cliente) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "El Proveedor fue eliminado");
        }
    }

    public void ModificarProveedor(ObjectContainer basep, String ID_proveedor, String ID, String nombre, String apellido, String telefono, String direccion) {
        Proveedor proveedor = new Proveedor(ID_proveedor, null, null, null, null, null);
        ObjectSet resultado = basep.get(proveedor);
        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Proveedor no se encuentra");
        } else {
            Proveedor modificar = (Proveedor) resultado.next();
            modificar.setNombre(nombre);
            modificar.setApellido(apellido);
            modificar.setDireccion(direccion);
            modificar.setTelefono(telefono);
            JOptionPane.showMessageDialog(null, "El Proveedor fue modificado");
            basep.set(modificar);
        }
    }

    //repartidor
    public void CrearRepartidor(ObjectContainer basep, String ID, String cedula, String nombre, String apellido, String telefono, String direccion, String Num_placa_moto) {
        Repartidor repartidor = new Repartidor(ID, cedula, nombre, apellido, telefono, direccion, Num_placa_moto);
        if (ComprobarRepartidor(basep, cedula) != 0) {
            JOptionPane.showMessageDialog(null, "Registro Existente");
        } else {
            basep.set(repartidor);
            JOptionPane.showMessageDialog(null, "Registro Guardado");
        }

    }

    public static int ComprobarRepartidor(ObjectContainer basep, String cedula) {
        Repartidor repartidor = new Repartidor(null, cedula, null, null, null, null, null);
        ObjectSet resultado = basep.get(repartidor);
        return resultado.size();
    }

    public void EliminarRepartidor(ObjectContainer basep, String cedula) {
        Repartidor repartidor = new Repartidor(null, cedula, null, null, null, null, null);
        ObjectSet resultado = basep.get(repartidor);

        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Repartidor no se encuentra");
        } else {
            Cliente eliminar = (Cliente) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "El Repartidor fue eliminado");
        }
    }

    public void ModificarRepartidor(ObjectContainer basep, String ID, String cedula, String nombre, String apellido, String telefono, String direccion, String Num_placa_moto) {
        Repartidor repartidor = new Repartidor(null, cedula, null, null, null, null, null);
        ObjectSet resultado = basep.get(repartidor);
        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El Repartidor no se encuentra");
        } else {
            Repartidor modificar = (Repartidor) resultado.next();
            modificar.setNombre(nombre);
            modificar.setApellido(apellido);
            modificar.setDireccion(direccion);
            modificar.setTelefono(telefono);
            JOptionPane.showMessageDialog(null, "El Repartidor fue modificado");
            basep.set(modificar);
        }
    }

    public void Cerrarbd(ObjectContainer basep) {
        basep.close();
    }
}
