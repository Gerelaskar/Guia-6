/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggguia6fundamentales;

/**
 *
 * @author elask
 */
public class Ejercicioextra2 {
   // Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
   //una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
   //tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
   //iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
   
    public static void main(String[] args) {
        
        int A, B, C, D, AUX;
        
        A = 1;
        B = 2; 
        C = 3;
        D = 4;
        
        System.out.println("Los valores son: \n "
                +" A = " + A 
                +" B = " + B 
                +" C = "+ C 
                +" D = "+ D);
        
        
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
        
        System.out.println("Los valores cambiados son: \n" 
                +" A = " + A 
                +" B = " + B 
                +" C = "+ C 
                +" D = "+ D);
        
    }
}
