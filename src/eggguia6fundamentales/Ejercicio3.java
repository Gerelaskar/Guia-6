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
public class Ejercicio3 {
    public static void main(String[] args) {
        
        String nombre;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        nombre=leer.nextLine();
        
        //MAYUSCULA
        System.out.println("Su nombre en mayuscula es " +nombre.toUpperCase());
        
        //minuscula
        System.out.println("Su nombre en minuscula es " +nombre.toLowerCase() );
    
    }
}
