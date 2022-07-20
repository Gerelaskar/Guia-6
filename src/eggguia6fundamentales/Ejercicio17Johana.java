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
public class Ejercicio17Johana {
    public static void main(String[] args) {
       
        int[] vector = new int[5];
        
        IniciarVector(vector);
        ContarDigitos(vector);
    }
    
    public static void IniciarVector(int[] vector){
        
        vector[0] = 1;
        vector[1] = 10;
        vector[2] = 100;
        vector[3] = 1000;
        vector[4] = 10000;
    
    }
    
    public static void ContarDigitos(int[] vector){
        
        String aux;
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dig4 = 0;
        int dig5 = 0;
                
        
        for (int i = 0; i < 5; i++) {
            
            aux = Integer.toString(vector[i]);
            
            switch(aux.length()){
                
                case 1:
                    dig1 += 1;
                    break;
                case 2:
                    dig2 += 1;
                    break;
                case 3:
                    dig3 += 1;
                    break;
                case 4:
                    dig4 += 1;
                    break;
                case 5:
                    dig5 += 1;
                    break;
                default:
                    
            }
            
        }
        
        System.out.println("Cantidad de numeros con un 1 digito --> "+dig1);
        System.out.println("Cantidad de numeros con un 2 digito --> "+dig2);
        System.out.println("Cantidad de numeros con un 3 digito --> "+dig3);
        System.out.println("Cantidad de numeros con un 4 digito --> "+dig4);
        System.out.println("Cantidad de numeros con un 5 digito --> "+dig5);
    
    }

    
}
