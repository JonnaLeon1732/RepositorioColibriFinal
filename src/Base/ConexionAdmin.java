/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import clases.Administrador;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JOptionPane;

/**
 *
 * @author CyberLink
 */
public class ConexionAdmin {

    public ConexionAdmin() {
    }
    public ObjectContainer BaseUsuario(){
        ObjectContainer contenedor=Db4o.openFile("C:\\Program Files\\Colibri\\BaseAdmin.yap");
        return contenedor;
    }
    public void CrearUsuario(ObjectContainer basep, String ID, String nombre, String apellido, String telefono, String direccion, String correo, String nom_usuario, String contrasena){
        Administrador administrador=new Administrador(ID,nombre,apellido,telefono,direccion,correo,nom_usuario,contrasena);
        if (ComprobarUsuario(basep,ID)!=0) {
            JOptionPane.showMessageDialog(null,"Registro Existente");
        }else{
            basep.set(administrador);
            JOptionPane.showMessageDialog(null,"Registro Guardado");
        }
    }
    
    public static int ComprobarUsuario(ObjectContainer basep,String ID){
        Administrador administrador=new Administrador(ID,null,null,null,null,null,null,null);
        ObjectSet resultado=basep.get(administrador);
        return resultado.size();
    }
    
    public void Cerrarbd(ObjectContainer basep){
        basep.close();
    }
    
    public boolean ConsultarUsuario(ObjectContainer basep,String nom_usuario,String contrasena){
        Administrador administrador=new Administrador(null,null,null,null,null,null,nom_usuario,contrasena);
        ObjectSet resultado=basep.get(administrador);
        if (resultado.size()==0) {
            return false;
        }else{
            return true;
        }
    }

}
