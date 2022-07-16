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
public class Ejercicio2 {
    public static void main(String[] args) {
       // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
       //pantalla.
       
       String nombre ; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre ");
        nombre = leer.nextLine();
        
        System.out.println("Su nombre es " +nombre);
    }
    
}
