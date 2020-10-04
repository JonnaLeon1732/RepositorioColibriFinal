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
public class Enc_Factura {
     private int num_Factura;
    private String nom_cliente;
    private String ape_cliente;
    private String ID_cliente;
    private String telefono_cliente;
    private String direccion_cliente;
    private String correo_cliente;

    public Enc_Factura(int num_Factura, String nom_cliente, String ape_cliente, String ID_cliente, String telefono_cliente, String direccion_cliente, String correo_cliente) {
        this.num_Factura = num_Factura;
        this.nom_cliente = nom_cliente;
        this.ape_cliente = ape_cliente;
        this.ID_cliente = ID_cliente;
        this.telefono_cliente = telefono_cliente;
        this.direccion_cliente = direccion_cliente;
        this.correo_cliente = correo_cliente;
    }

    

    
    public Enc_Factura() {
    }

    
    
    public String getApe_cliente() {
        return ape_cliente;
    }

    public void setApe_cliente(String ape_cliente) {
        this.ape_cliente = ape_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }


    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public int getNum_Factura() {
        return num_Factura;
    }

    public void setNum_Factura(int num_Factura) {
        this.num_Factura = num_Factura;
    }

    @Override
    public String toString() {
        return "Enc_Factura{" + "num_Factura=" + num_Factura + ", nom_cliente=" + nom_cliente + ", ape_cliente=" + ape_cliente + ", ID_cliente=" + ID_cliente + ", telefono_cliente=" + telefono_cliente + ", direccion_cliente=" + direccion_cliente + ", correo_cliente=" + correo_cliente + '}';
    }
    

    
}
