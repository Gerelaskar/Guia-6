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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el valor limite ");
        int limite = leer.nextInt();
        //inicializo la variable suma en 0
        int suma = 0;
        do{
            System.out.println("Ingrese el numero limite ");
            int num=leer.nextInt();
            suma = suma + num; 
        }while (suma<limite);
        System.out.println("La suma es mayor al limite ");
    }
    
}
