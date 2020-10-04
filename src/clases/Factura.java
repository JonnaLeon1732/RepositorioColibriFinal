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
public class Factura {
    private int num_Factura;
  private String fecha;

    public Factura(int num_Factua, String fecha) {
        this.num_Factura = num_Factura;
        this.fecha = fecha;
    }

    public int getNum_Factua() {
        return num_Factura;
    }

    public void setNum_Factua(int num_Factua) {
        this.num_Factura = num_Factura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Factura" + "num_Factura=" + num_Factura + ", fecha=" + fecha;
    }
   
}
