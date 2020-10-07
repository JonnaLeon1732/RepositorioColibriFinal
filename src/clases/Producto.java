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
public class Producto {
  private String codigo;
    private String nombre;
    private String descripcion;
    private int existencias;
    private double precio;
    private String ID_proveedor;

    public Producto(String codigo, String nombre, String descripcion, int exitencias, double precio, String ID_proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.existencias = exitencias;
        this.precio = precio;
        this.ID_proveedor = ID_proveedor;
    }

    public Producto() {
    }
    

    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getID_proveedor() {
        return ID_proveedor;
    }

    public void setID_proveedor(String ID_proveedor) {
        this.ID_proveedor = ID_proveedor;
    }

    public static void vende() {

    }
}
