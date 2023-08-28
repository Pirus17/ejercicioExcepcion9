/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexception9;

import java.util.Scanner;

/**
 *
 * @author Piruxb17
 */
public class EjercicioException9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scr= new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String lec_teclado= scr.nextLine();
        try{
            System.out.println("la posisicion es: "+caracterEn(lec_teclado,7));
           
        }
        catch(Exception e){
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }   // TODO code application logic here
    }
     
    public static char caracterEn(String palabra, int numero ){
        return palabra.charAt(numero) ;
    }
    
}

