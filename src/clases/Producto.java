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
    private int existencias,ex_max, ex_min;
    private String s = Integer.toString(existencias);
    private double precio;
    private String d = Double.toString(precio);
    private String ID_proveedor;

    public Producto(String codigo, String nombre, String descripcion, int exitencias, int ex_max, int ex_min, double precio, String ID_proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.existencias = exitencias;
        this.ex_max = ex_max;
        this.ex_min = ex_min;
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

    public int getEx_max() {
        return ex_max;
    }

    public void setEx_max(int ex_max) {
        this.ex_max = ex_max;
    }

    public int getEx_min() {
        return ex_min;
    }

    public void setEx_min(int ex_min) {
        this.ex_min = ex_min;
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

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
    

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", exitencias=" + existencias + ", ex_max=" + ex_max + ", ex_min=" + ex_min + ", precio=" + precio + ", ID_proveedor=" + ID_proveedor + '}';
    }   

    public String setCodigo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
