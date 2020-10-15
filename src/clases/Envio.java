/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public class Envio {
 private String direccion_cli;
private String nombre_rep;
private String Num_placa_moto;   
private String Cedula_repartidor;

    public Envio() {
    }

    public Envio(String direccion_cli, String nombre_rep, String Num_placa_moto, String Cedula_repartidor) {
        this.direccion_cli = direccion_cli;
        this.nombre_rep = nombre_rep;
        this.Num_placa_moto = Num_placa_moto;
        this.Cedula_repartidor = Cedula_repartidor;
    }


    public String getDireccion_cli() {
        return direccion_cli;
    }

    public void setDireccion_cli(String direccion_cli) {
        this.direccion_cli = direccion_cli;
    }

    public String getNombre_rep() {
        return nombre_rep;
    }

    public void setNombre_rep(String nombre_rep) {
        this.nombre_rep = nombre_rep;
    }

    public String getNum_placa_moto() {
        return Num_placa_moto;
    }

    public void setNum_placa_moto(String Num_placa_moto) {
        this.Num_placa_moto = Num_placa_moto;
    }

    public String getCedula_repartidor() {
        return Cedula_repartidor;
    }

    public void setCedula_repartidor(String Cedula_repartidor) {
        this.Cedula_repartidor = Cedula_repartidor;
    }

    @Override
    public String toString() {
        return "Envio{" + "direccion_cli=" + direccion_cli + ", nombre_rep=" + nombre_rep + ", Num_placa_moto=" + Num_placa_moto + ", Cedula_repartidor=" + Cedula_repartidor + '}';
    }

   

    

   
}
