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
public class Ejercicio1extra {
    
    //Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    //usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos a calcular: ");
        
        double min = leer.nextInt();
        
        double horas = 0, dias = 0;
        
        horas= min/60;
        horas= Math.floor(horas);
        while (horas>=24){
            dias=dias+1;
            horas=horas-24;
        }
        System.out.println("La cantidad es: " +dias + " dias " + "," +horas+ " Horas");
    }
}
