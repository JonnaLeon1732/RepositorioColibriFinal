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
public class Det_Factura implements Calcular_pag {

    private int num_Factura;
    private String cod_producto;
    private String descripcion_Pro;
    private double prec_uni;
    private double pre_total;
    private double total_pag;

    public Det_Factura(int num_Factura, String cod_producto, String descripcion_Pro, double prec_uni, double pre_total, double total_pag) {
        this.num_Factura = num_Factura;
        this.cod_producto = cod_producto;
        this.descripcion_Pro = descripcion_Pro;
        this.prec_uni = prec_uni;
        this.pre_total = pre_total;
        this.total_pag = total_pag;
    }

    public Det_Factura() {
    }

  

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getDescripcion_Pro() {
        return descripcion_Pro;
    }

    public void setDescripcion_Pro(String descripcion_Pro) {
        this.descripcion_Pro = descripcion_Pro;
    }

    public double getPrec_uni() {
        return prec_uni;
    }

    public void setPrec_uni(double prec_uni) {
        this.prec_uni = prec_uni;
    }

    public double getPre_total() {
        return pre_total;
    }

    public void setPre_total(double pre_total) {
        this.pre_total = pre_total;
    }

    public double getTotal_pag() {
        return total_pag;
    }

    public void setTotal_pag(double total_pag) {
        this.total_pag = total_pag;
    }

   

    public int getNum_Factura() {
        return num_Factura;
    }

    public void setNum_Factura(int num_Factura) {
        this.num_Factura = num_Factura;
    }

    @Override
    public String toString() {
        return "Det_Factura" + "num_Factura=" + num_Factura + ", cod_producto=" + cod_producto + ", descripcion_Pro=" + descripcion_Pro + ", prec_uni=" + prec_uni + ", pre_total=" + pre_total + ", total_pag=" + total_pag;
    }
    
    
}
