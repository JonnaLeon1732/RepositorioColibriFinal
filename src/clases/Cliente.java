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
 
    private String ID_cliente;
    private String correo;

    public Cliente(String ID_cliente, String correo, String ID, String nombre, String apellido, String telefono, String direccion) {
        super(ID, nombre, apellido, telefono, direccion);
        this.ID_cliente = ID_cliente;
        this.correo = correo;
    }

    public Cliente() {
    }
    

    public String getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public static void comprar() {

    }

    @Override
    public String toString() {
        return "Client" + "ID_cliente=" + ID_cliente + ", correo=" + correo;
    }   
}

