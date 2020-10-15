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

   

    public Repartidor(String cedula, String nombre, String apellido, String telefono, String direccion,String Num_placa_moto) {
        super(cedula, nombre, apellido, telefono, direccion);
        this.Num_placa_moto = Num_placa_moto;
       
    }

    public Repartidor() {
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
        return "Repartidor{" + "Num_placa_moto=" + Num_placa_moto +"}";
    }

    
    
    
}
