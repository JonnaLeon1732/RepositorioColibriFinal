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
public class Carrito implements Calcular_pag{
 private String nombre_pro;
 private int cantidad_pro;
 private double total_pag;
 private boolean entregado;

    public Carrito(String nombre_pro, int cantidad_pro, double total_pag, boolean entregado) {
        this.nombre_pro = nombre_pro;
        this.cantidad_pro = cantidad_pro;
        this.total_pag = total_pag;
        this.entregado = entregado;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public int getCantidad_pro() {
        return cantidad_pro;
    }

    public void setCantidad_pro(int cantidad_pro) {
        this.cantidad_pro = cantidad_pro;
    }

    public double getTotal_pag() {
        return total_pag;
    }

    public void setTotal_pag(double total_pag) {
        this.total_pag = total_pag;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
 
 
 public boolean comprobar_entrega(){
     return false;
     
 }

    @Override
    public String toString() {
        return "Carrito" + "nombre_pro=" + nombre_pro + ", cantidad_pro=" + cantidad_pro + ", total_pag=" + total_pag + ", entregado=" + entregado;
    }
 
}
