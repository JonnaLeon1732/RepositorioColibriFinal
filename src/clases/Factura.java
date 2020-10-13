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
public class Factura extends Carro{
   private String cod_factura;
   private String num_factura;
   private String fecha;
    public Factura() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Factura(String cod_factura,String fecha, String num_fatura, String cod_prov, String cod_prod, String nom_prod, String tip_prod, int cant, double precio_Total) {
        super(cod_prov, cod_prod, nom_prod, tip_prod, cant, precio_Total);
        this.cod_factura = cod_factura;
        this.num_factura = num_fatura;
        this.fecha = fecha;
    }

    public String getCod_factura() {
        return cod_factura;
    }

    public void setCod_factura(String cod_factura) {
        this.cod_factura = cod_factura;
    }

    public String getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(String num_factura) {
        this.num_factura = num_factura;
    }
   
}
