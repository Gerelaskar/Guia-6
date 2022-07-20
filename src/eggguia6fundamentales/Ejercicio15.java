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
public class Ejercicio15 {
    public static void main(String[] args) {
        //defino el vector, lo inicializo
        int [] vector = new int [100];
        //lo recorro
        for (int i =0; i <100; i++){
            vector [i] = i + 1 ; //le aumento 1 para que el vector empiece a contar de 1 y no de 0
        }
        
        //lo recorro de manera descendiente 
        for(int i = 100 -1 ; i >= 0; i-- ){
            
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        
        
        
        
        
        //defino el vector, lo inicializo
        int [] vector2 = new int [100];
        //lo recorro
        for (int i =0; i <100; i++){
            vector2 [i] = i + 1 ; //le aumento 1 para que el vector empiece a contar de 1 y no de 0
        }
        for(int i =0 ; i < 100; i++ ){
            System.out.print("[" + vector2[i] + "]");
        }
        System.out.println("");
        
            }
            
     
        
          
}
