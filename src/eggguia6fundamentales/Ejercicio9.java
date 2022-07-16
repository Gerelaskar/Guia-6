/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggguia6fundamentales;

import java.util.Scanner;

/**
 *
 * @author elask
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la frase o palabra ");
        String frase=leer.next();
        
        //DECIMOS QUE VEA LA PRIMER LETRA DE LA PALABRA
        String letra =frase.substring(0,1);
        
        if (letra.equalsIgnoreCase("a")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
