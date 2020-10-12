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
    private String codigo_prov;

    public Proveedor(String codigo_prov, String ID, String nombre, String apellido, String telefono, String direccion) {
        super(ID, nombre, apellido, telefono, direccion);
        this.codigo_prov = codigo_prov;
    }

    public Proveedor() {
    }
    

    public String getCodigo_prov() {
        return codigo_prov;
    }

    public void setCodigo_prov(String codigo_prov) {
        this.codigo_prov = codigo_prov;
    }
    public static void proveeer(){
        
    }
    @Override
    public String toString() {
        return "Proveedor{" + "ID_proveedor=" + codigo_prov + '}';
    } 
}
