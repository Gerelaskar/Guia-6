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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
      //dos. El programa deberá después mostrar el resultado de la suma
      
      int num1, num2;
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese un numero entero ");  //Pido un numero al usuario
        
        num1 = leer.nextInt();        // el usuario ingresa el numero por consola
        
        System.out.println("Ingrese otro numero entero ");
        
        num2 = leer.nextInt();
        
        // realizo la suma de los numeros ingresados
        
        int suma = num1 + num2 ;
        
        //imprimo por pantalla el resultado de los numeros 
        
        System.out.println("La suma de los numeros es " +suma);
        
        
      
    }
    
}
