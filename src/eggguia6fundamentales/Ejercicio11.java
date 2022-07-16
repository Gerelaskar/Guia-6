/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggguia6fundamentales;

import java.util.Scanner;

/**
 *Realizar un programa que pida dos nÃºmeros enteros positivos por teclado y muestre por 
            pantalla el siguiente menÃº:
            MENU
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. Salir
            Elija opciÃ³n:
            El usuario deberÃ¡ elegir una opciÃ³n y el programa deberÃ¡ mostrar el resultado por pantalla 
            y luego volver al menÃº. El programa deberÃ¡ ejecutarse hasta que se elija la opciÃ³n 5. 
            Tener en cuenta que, si el usuario selecciona la opciÃ³n 5, en vez de salir del programa 
            directamente, se debe mostrar el siguiente mensaje de confirmaciÃ³n: Â¿EstÃ¡ seguro que 
            desea salir del programa (S/N)? Si el usuario selecciona el carÃ¡cter â€˜Sâ€™ se sale del 
            programa, caso contrario se vuelve a mostrar el menÃº
 * @author elask
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1 ");
        double num1=leer.nextDouble();
        
        System.out.println("Ingrese el numero 2 ");
        double num2=leer.nextDouble();
        int opcion=0;
       
        do{
            
            System.out.println("Seleccione una opcion ");
            
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                     double suma=num1+num2;
                    System.out.println("SUMA " +suma);
                   
                    break;
                case 2:
                     double resta=num1-num2;
                     System.out.println("RESTA " + resta);
                   
                    break;
                case 3:
                     double mult=num1*num2;
                     System.out.println("MULTIPLICACION " +mult);
                   
                    break;
                case 4:
                    double div=num1/num2;
                     System.out.println("DIVISION " + div);
                    
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? ");
                   String letra = leer.nextLine();
                    if (letra.equalsIgnoreCase("S")){
                         break;
                    }else{
                        opcion = 0;
                    }
                        
            }       

        }while (opcion != 5);
            
                
            
    }
}
