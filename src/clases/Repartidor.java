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
public class Repartidor extends Persona{
  private String Num_placa_moto; 
  private String cedula_repartidor; 

   

    public Repartidor( String ID,String cedula, String nombre, String apellido, String telefono, String direccion,String Num_placa_moto) {
        super(ID, nombre, apellido, telefono, direccion);
        this.Num_placa_moto = Num_placa_moto;
        this.cedula_repartidor=cedula;
    }

    public Repartidor() {
    }

    public String getCedula_repartidor() {
        return cedula_repartidor;
    }

    public void setCedula_repartidor(String cedula_repartidor) {
        this.cedula_repartidor = cedula_repartidor;
    }

    public String getNum_placa_moto() {
        return Num_placa_moto;
    }

    public void setNum_placa_moto(String Num_placa_moto) {
        this.Num_placa_moto = Num_placa_moto;
    }
    public static void reparte(){
        
    }
    public static void cobra(){
        
    }

    @Override
    public String toString() {
        return "Repartidor{" + "Num_placa_moto=" + Num_placa_moto + ", cedula_repartidor=" + cedula_repartidor + '}';
    }

    
    
    
}
