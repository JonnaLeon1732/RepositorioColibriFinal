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
public class Proveedor extends Persona {
    private String ID_proveedor;

    public Proveedor(String ID_proveedor, String ID, String nombre, String apellido, String telefono, String direccion) {
        super(ID, nombre, apellido, telefono, direccion);
        this.ID_proveedor = ID_proveedor;
    }

    public Proveedor() {
    }
    

    public String getID_proveedor() {
        return ID_proveedor;
    }

    public void setID_proveedor(String ID_proveedor) {
        this.ID_proveedor = ID_proveedor;
    }
    public static void proveeer(){
        
    }
    @Override
    public String toString() {
        return "Proveedor{" + "ID_proveedor=" + ID_proveedor + '}';
    } 
}
