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
public class Carro{
    private String cod_prov;
    private String cod_prod;
    private String nom_prod;
    private String tip_prod;
    private int cant;
    private double precio_Total;

    public Carro() {
    }

    public Carro(String cod_prov, String cod_prod, String nom_prod, String tip_prod, int cant, double precio_Total) {
        this.cod_prov = cod_prov;
        this.cod_prod = cod_prod;
        this.nom_prod = nom_prod;
        this.tip_prod = tip_prod;
        this.cant = cant;
        this.precio_Total = precio_Total;
    }

    public String getCod_prov() {
        return cod_prov;
    }

    public void setCod_prov(String cod_prov) {
        this.cod_prov = cod_prov;
    }

    public String getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(String cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public String getTip_prod() {
        return tip_prod;
    }

    public void setTip_prod(String tip_prod) {
        this.tip_prod = tip_prod;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio_Total() {
        return precio_Total;
    }

    public void setPrecio_Total(double precio_Total) {
        this.precio_Total = precio_Total;
    }

}
