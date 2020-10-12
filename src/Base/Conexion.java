package Base;

import clases.Cliente;
import clases.Proveedor;
import clases.Repartidor;
import clases.Enc_Factura;
import clases.Det_Factura;
import clases.Producto;
import javax.swing.JOptionPane;
import com.db4o.*;

/**
 *
 * @author Grupo 2
 */
public class Conexion {

    //cliente
    public ObjectContainer BaseCliente() {
        ObjectContainer contenedor = Db4o.openFile("C:\\Users\\stefa\\Desktop\\Base.yap");
        return contenedor;
    }

//    public ObjectContainer BaseProveedor() {
//        ObjectContainer contenedor = Db4o.openFile("C:\\Program Files\\Colibri\\Base.yap");
//        return contenedor;
//    }

    public ObjectContainer BaseRepartidor() {
        ObjectContainer contenedor = Db4o.openFile("C:\\Users\\stefa\\Desktop\\Base.yap");
        return contenedor;
    }
    
    public ObjectContainer enca_fact() {
        ObjectContainer contenedor = Db4o.openFile("C:\\Users\\stefa\\Desktop\\Base.yap");
        return contenedor;
    }

    public ObjectContainer deta_fact() {
        ObjectContainer contenedor = Db4o.openFile("C:\\Users\\stefa\\Desktop\\Base.yap");
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

//    //proveedor
//    public void CrearProveedor(ObjectContainer basep, String ID_proveedor, String ID, String nombre, String apellido, String telefono, String direccion) {
//        Proveedor proveedor = new Proveedor(ID_proveedor, ID, nombre, apellido, telefono, direccion);
//        if (ComprobarProveedor(basep, ID_proveedor) != 0) {
//            JOptionPane.showMessageDialog(null, "Registro Existente");
//        } else {
//            basep.set(proveedor);
//            JOptionPane.showMessageDialog(null, "Registro Guardado");
//        }
//
//    }
//
//    public static int ComprobarProveedor(ObjectContainer basep, String ID_proveedor) {
//        Proveedor proveedor = new Proveedor(ID_proveedor, null, null, null, null, null);
//        ObjectSet resultado = basep.get(proveedor);
//        return resultado.size();
//    }
//
//    public boolean ConsultarProveedor(ObjectContainer basep, String ID_proveedor) {
//        Proveedor proveedor = new Proveedor(ID_proveedor, null, null, null, null, null);
//        ObjectSet resultado = basep.get(proveedor);
//        if (resultado.size() == 0) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//
//    public void EliminarProveedor(ObjectContainer basep, String ID_proveedor) {
//        Proveedor proveedor = new Proveedor(ID_proveedor, null, null, null, null, null);
//        ObjectSet resultado = basep.get(proveedor);
//
//        if (resultado.size() == 0) {
//            JOptionPane.showMessageDialog(null, "El Proveedor no se encuentra");
//        } else {
//            Cliente eliminar = (Cliente) resultado.next();
//            basep.delete(eliminar);
//            JOptionPane.showMessageDialog(null, "El Proveedor fue eliminado");
//        }
//    }
//
//    public void ModificarProveedor(ObjectContainer basep, String ID_proveedor, String ID, String nombre, String apellido, String telefono, String direccion) {
//        Proveedor proveedor = new Proveedor(ID_proveedor, null, null, null, null, null);
//        ObjectSet resultado = basep.get(proveedor);
//        if (resultado.size() == 0) {
//            JOptionPane.showMessageDialog(null, "El Proveedor no se encuentra");
//        } else {
//            Proveedor modificar = (Proveedor) resultado.next();
//            modificar.setNombre(nombre);
//            modificar.setApellido(apellido);
//            modificar.setDireccion(direccion);
//            modificar.setTelefono(telefono);
//            JOptionPane.showMessageDialog(null, "El Proveedor fue modificado");
//            basep.set(modificar);
//        }
//    }

    //repartidor
    public void CrearRepartidor(ObjectContainer basep,String ID,String cedula, String nombre, String apellido, String telefono, String direccion,String Num_placa_moto) {
        Repartidor repartidor = new Repartidor(  ID,cedula, nombre, apellido, telefono,  direccion, Num_placa_moto);
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
            Repartidor eliminar = (Repartidor) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "El Repartidor fue eliminado");
        }
    }
      public boolean ConsultarRepartidor(ObjectContainer basep, String cedula) {
        Repartidor repartidor = new Repartidor(null, cedula, null, null, null, null, null);
        ObjectSet resultado = basep.get(repartidor);
        if (resultado.size() == 0) {
            return false;
        } else {
            return true;
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
    
    //encabezado factura
    public void CrearEnca(ObjectContainer basep, int num_fac, String ID_cliente, String nombre, String apellido, String telefono, String direccion, String correo) {
        Enc_Factura enca = new Enc_Factura(num_fac,nombre, apellido, ID_cliente, telefono, direccion, correo);
        if (ComprobarEnca(basep, ID_cliente) != 0) {
            JOptionPane.showMessageDialog(null, "Registro Existente");
        } else {
            basep.set(enca);
            JOptionPane.showMessageDialog(null, "Registro Guardado");
        }

    }

    public static int ComprobarEnca(ObjectContainer basep, String ID_cliente) {
        Enc_Factura enca = new Enc_Factura(0,null, null, ID_cliente, null, null, null);
        ObjectSet resultado = basep.get(enca);
        return resultado.size();
    }

    public static void ConsultarEnca(ObjectContainer basep, String ID_cliente) {
        Cliente cliente = new Cliente(ID_cliente, null, null, null, null, null, null);
        Enc_Factura enca = new Enc_Factura(0,null, null, ID_cliente, null, null, null);
        ObjectSet resultado = basep.get(cliente);
        ObjectSet resultadoen = basep.get(enca);
        while(resultado.hasNext()){
            JOptionPane.showMessageDialog(null,resultado.next());
            
        }
         while(resultadoen.hasNext()){
           JOptionPane.showMessageDialog(null,resultadoen.next());
           
        }
    }

    public void EliminarEnca(ObjectContainer basep, int num_fac) {
        Enc_Factura enca = new Enc_Factura(num_fac,null, null, null, null, null, null);
        ObjectSet resultado = basep.get(enca);

        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "La factura no se encuentra");
        } else {
            Enc_Factura eliminar = (Enc_Factura) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "La factura fue eliminada");
        }
    }

    public void ModificarEnca(ObjectContainer basep, int num_fac, String ID_cliente, String nombre, String apellido, String telefono, String direccion, String correo) {
        Enc_Factura enca = new Enc_Factura(num_fac,null, null, ID_cliente, null, null, null);
        ObjectSet resultado = basep.get(enca);
        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El encabezado de la factura no se encuentra");
        } else {
            Enc_Factura modificar = (Enc_Factura) resultado.next();
            modificar.setNom_cliente(nombre);
            modificar.setApe_cliente(apellido);
            modificar.setDireccion_cliente(direccion);
            modificar.setTelefono_cliente(telefono);
            modificar.setCorreo_cliente(correo);
            JOptionPane.showMessageDialog(null, "El encabezado de la factura fue modificado");
            basep.set(modificar);
        }
    }

    //detalle de la factura
    public void CrearDeta_Fac(ObjectContainer basep, int num_fac, String cod_prod, String descripcion, Double precio_uni, Double precio_tot, Double tot_pagar) {
        Det_Factura enca = new Det_Factura(num_fac,cod_prod, descripcion, precio_uni, precio_tot, tot_pagar);
        if (ComprobarDeta_Fac(basep, cod_prod) != 0) {
            JOptionPane.showMessageDialog(null, "Registro Existente");
        } else {
            basep.set(enca);
            JOptionPane.showMessageDialog(null, "Registro Guardado");
        }

    }

    public static int ComprobarDeta_Fac(ObjectContainer basep, String cod_prod) {
        Det_Factura enca = new Det_Factura(0,cod_prod, null, 0, 0, 0);
        ObjectSet resultado = basep.get(enca);
        return resultado.size();
    }

    public static void ConsultarDeta_Fac(ObjectContainer basep, String cod_prod) {
        Det_Factura detfac = new Det_Factura(0,cod_prod, null, 0, 0, 0);
        Producto prod = new Producto(cod_prod,null,null,0,0,null);
        ObjectSet resultado = basep.get(prod);
        ObjectSet resultadofac = basep.get(detfac);
        while(resultado.hasNext()){
            JOptionPane.showMessageDialog(null,resultado.next());
            
        }
         while(resultadofac.hasNext()){
           JOptionPane.showMessageDialog(null,resultadofac.next());
           
        }
    }

    public void EliminarDeta_Fac(ObjectContainer basep, int num_fac) {
        Enc_Factura enca = new Enc_Factura(num_fac,null, null, null, null, null, null);
        ObjectSet resultado = basep.get(enca);

        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El encabezado de la factura no se encuentra");
        } else {
            Enc_Factura eliminar = (Enc_Factura) resultado.next();
            basep.delete(eliminar);
            JOptionPane.showMessageDialog(null, "El encabezado de la factura fue eliminada");
        }
    }

    public void ModificarDeta_Fac(ObjectContainer basep,int num_fac, String cod_prod, String descripcion, Double precio_uni, Double precio_tot, Double tot_pagar ) {
        Det_Factura enca = new Det_Factura(num_fac,cod_prod, null, 0, 0, 0);
        ObjectSet resultado = basep.get(enca);
        if (resultado.size() == 0) {
            JOptionPane.showMessageDialog(null, "El detalle de la factura no se encuentra");
        } else {
            Det_Factura modificar = (Det_Factura) resultado.next();
            modificar.setDescripcion_Pro(descripcion);
            modificar.setPrec_uni(precio_uni);
            modificar.setPre_total(precio_tot);
            modificar.setTotal_pag(tot_pagar);
            JOptionPane.showMessageDialog(null, "El detalle de la factura fue modificado");
            basep.set(modificar);
        }
    }
    
    public void Cerrarbd(ObjectContainer basep) {
        basep.close();
    }
}
