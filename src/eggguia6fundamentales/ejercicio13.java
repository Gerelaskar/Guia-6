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
public class ejercicio13 {
    public static void main(String[] args) {
        
        
        int  n ;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        
        n = leer.nextInt();
         //linea superios 
        for (int a = 0; a < n; a++ ) {
            System.out.print(" * ");
        }
        System.out.println("  ");
        
        //centro de la forma
       
        for (int a = 0; a < n-2 ; a++ ) {
            System.out.print(" * ");
            for (int b = 0 ; b < n-2; b++){
                System.out.print("   ");
            }
            System.out.println(" * ");
        }
        
         //linea inferior
        for (int a = 0; a < n; a++ ) {
            System.out.print(" * ");
        }
        
    }
    
}
