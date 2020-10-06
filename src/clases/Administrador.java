/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class Administrador extends Persona{
    
    private String correo;
    private String nom_usuario;
    private String contrasena;

    public Administrador() {
    }

    public Administrador( String ID, String nombre, String apellido, String telefono, String direccion, String correo, String nom_usuario, String contrasena) {
        super(ID, nombre, apellido, telefono, direccion);
        this.correo = correo;
        this.nom_usuario = nom_usuario;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return  super.toString()+"Administrador{" + "correo=" + correo + ", nom_usuario=" + nom_usuario + ", contrase\u00f1a=" + contrasena + '}';
    }

    
    
    
    
}
