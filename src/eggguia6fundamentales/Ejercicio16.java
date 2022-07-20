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
public class Ejercicio16 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        
        int n = leer.nextInt();
        int n2= leer.nextInt();
        int [] vector = new int [n];
        
        
        for (int i = 0; i < n; i++) {
            
            vector(i) = (int)(Math.random () *100);
            
        }
        System.out.println("Ingrese el numero a buscar ");
        int n2= leer.nextInt();
        
        
    }
 
    
    
}
