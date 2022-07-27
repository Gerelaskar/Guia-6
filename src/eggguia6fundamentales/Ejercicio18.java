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
public class Ejercicio18 {
    public static void main(String[] args) {
        int [] [] matriz ; 
        matriz = new int [4] [4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                matriz [i] [j] = (int)(Math.random()*10);
                System.out.print("[");
                System.out.print(matriz [i] [j]);
                System.out.print("]");
            }
            
        }
       
    }
}
