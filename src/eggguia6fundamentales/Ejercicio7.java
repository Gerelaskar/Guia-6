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
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase ");
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("La frase es correcta ");
            
        }else{
            System.out.println("la frase es incorrecta ");
        }
        
    }
          
}
