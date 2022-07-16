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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
        int num;
        System.out.println("Ingrese el numero");
        num = leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El num es par");
            
        }else{
            System.out.println("el num es impar");
        }
    }
}
