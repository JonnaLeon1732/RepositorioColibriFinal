/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Grupo 2
 */
public class Cliente extends Persona{
 
    
    private String correo;

    public Cliente(String ID, String nombre, String apellido, String telefono, String direccion,String correo) {
        super(ID, nombre, apellido, telefono, direccion);
        this.correo = correo;
    }

    public Cliente() {
    }
   
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public static void comprar() {

    }
}

