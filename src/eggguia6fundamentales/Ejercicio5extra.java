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
public class Ejercicio5extra {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
               
        //declaro un buleano para definir si es verdadero o falso 
        boolean error =false;
       
        //ingreso el codigo dentro de un do while para que este se repita cada vez q la informacion sea incorrecta
       do{
        System.out.println("ingrese su categoria");
        String letra=entrada.next();
        System.out.println("ingrese costo del tratamiento");
        float costo=entrada.nextFloat();
        letra=letra.toLowerCase();
            
        switch(letra){ 
            case "a":
               System.out.println("el costo del tratamiento es " +costo/2);
                error=true;
               break;
            case "b":
               System.out.println("el costo del tratamiento es " +costo*0.65);
                error=true;
               break;    
            case "c":
               System.out.println("el costo del tratamiento es " +costo);
               error=true;
               break;
            default:
                System.out.println("categoria no existe");
        }
       } while ( error==false);
    }
    
}

