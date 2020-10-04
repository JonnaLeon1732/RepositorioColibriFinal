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
public class Lista_Productos {
     private String nombre_pro;
  private String codigo;

    public Lista_Productos(String nombre_pro, String codigo) {
        this.nombre_pro = nombre_pro;
        this.codigo = codigo;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ListaProducto" + "nombre_pro=" + nombre_pro + ", codigo=" + codigo;
    }
  
}
