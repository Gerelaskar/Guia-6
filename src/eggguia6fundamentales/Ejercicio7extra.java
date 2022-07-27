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
public class Ejercicio7extra {
    /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
      de n números (n>0). El valor de n se solicitará al principio del programa y los números
      serán introducidos por el usuario. Realice dos versiones del programa, una usando el
      bucle “while” y otra con el bucle “do - while”.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println(" ingrese la cantidad de numeros que desea ");
        int n = leer.nextInt();
        int numero = 0;
        int suma=0;
        int max =0;
        int min=100000;
        
      while(n > 0){

          for (int i = 0; i < n ; i++) {
              System.out.println("ingrese  sus numeros ");
             numero = leer.nextInt();
             suma = suma+numero;
             if(numero < min){
                 min= numero;
             }else if ( numero > max ){
                 max=numero;
             }
             
           }
      }  
      
        System.out.println("  el promedio es " + suma/n);
        System.out.println(" el numero mayor es " + max + " y el menor es " + min);
    }
}
