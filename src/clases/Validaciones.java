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
import java.util.InputMismatchException;
import java.util.Scanner;
public class Validaciones {
//    public static void main(String[] args) {
        
//        Validaciones valid = new Validaciones();
//        
//    }
    
     public int validarMenu(){
        Scanner men= new Scanner(System.in);
        int Menu=0;  
     
     while (Menu==0){
         try {
        Menu = men.nextInt(); 
         }catch (InputMismatchException e) {
           men.nextLine();
         } 
        if (Menu >= 1 && Menu <=9){
            
        } else {
            System.out.println("El numero ingresado es incorrecto, debe estar en el rango de 1 a 9");
            Menu=0;
        }
     }
     return Menu;
    }
    
    public String valinumeros(String numer){
        Scanner valinum = new Scanner(System.in);
        String numeros="";
        while(numeros.equals("")){
            System.out.println(numer);
            numeros=valinum.nextLine();
            if(!numeros.matches("^[0-9]*$")){
                System.out.println("Se debe ingresar numeros");
                numeros="";
            }
        }
        return numeros;
    }
    
    
    public String valiletras(String letras){
        Scanner valilet= new Scanner(System.in);
        String Letras="";
        while(Letras.equals("")){
            System.out.println(letras);
            Letras=valilet.nextLine();
            if(!Letras.matches("^[A-Z a-z]*$")){
                System.out.println("Se debe ingresar letras");
                Letras="";
            }
        }
        return Letras;
    }
    
    public char comprobarSexo() {
        Scanner valicar = new Scanner(System.in);
        
        char sexo=' ';
        while(sexo==sexo){
            sexo=valicar.next().charAt(0);
            if (sexo == 'F' | sexo == 'M' | sexo=='f' | sexo=='m') {  
                
            }else{
            System.out.println("Ingrese una letra correspondiente al sexo");
            }
        }
        return sexo;
    }
    
    public int validarEdad(){
        Scanner excep= new Scanner(System.in);
        int ed=0;  
     
     while (ed==0){
         try {
        ed = excep.nextInt(); 
         }catch (InputMismatchException e) {
           excep.nextLine();
         } 
        if (ed >= 65 && ed <=100){
            
        } else {
            System.out.println("El numero ingresado es incorrecto, debe estar en el rango de 65 a 100");
            ed=0;
        }
     }
     return ed;
    }
    
    public String validarCorreo(){
            Scanner excep= new Scanner(System.in);
             String correo=null;  

             while (correo==null){
              try {
             correo = excep.nextLine(); 
              }catch (InputMismatchException e) {
                excep.nextLine();
              } 
             if ((correo != "@")&( correo != ".")){
                 System.out.println("El correo ingresado es incorrecto");
                 correo = null;
             } else {

             }

        } 
             return correo;
     }
    
     public int validarExistencias(){
     Scanner excep= new Scanner(System.in);
             int ex=0;  
             int ex_max=50;
             int ex_min=5;
     
     while (ex==0){
         try {
        ex = excep.nextInt(); 
         }catch (InputMismatchException e) {
           excep.nextLine();
         } 
        if (ex >= ex_min && ex <=ex_max){
            
        } if(ex>ex_max){
            System.out.println("El número de productos sobrepasa la cantidad permitida");
            ex=0;
        }if (ex<ex_min) {
             System.out.println("El número de productos es menor a la cantidad permitida");
            ex=0;
         }
     }
     return ex;
     }

}
