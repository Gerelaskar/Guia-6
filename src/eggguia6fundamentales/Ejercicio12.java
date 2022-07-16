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
public class Ejercicio12 {
    public static void main(String[] args) {
        
        /**Scanner leer = new Scanner(System.in);
        
        
        do{
        System.out.println("Ingresar la cadena del protocolo ");
        
        String cadena=leer.next();
        int longi = cadena.length();
        int cont_c = 0;
        int cont_i = 0;
        
        if(longi <= 5){
            
        String letra_inicial = cadena.substring(0,1);
        String letra_fin = cadena.substring(longi,-1);
        
        if(letra_inicial.equalsIgnoreCase("x") && letra_fin.equalsIgnoreCase ("o")){
            cont_c++;
        }else{
            cont_i++;
        }
        }while (cadena != "&&&&&");*/
        
        
        
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        int correcta = 0;
        int incorrecta = 0;
        
        do {
            System.out.println("ingrese una cadena");
            cadena = leer.next();

            int l = cadena.length();

            if (l<=5 && cadena.substring(0,1).equals("X") && cadena.substring(l-1,l).equals("O")) {
                correcta += 1;
            } else {
                incorrecta += 1;
            } 
        } while ( 0 != cadena.compareTo("&&&&&"));

        System.out.println("INFORME");
        System.out.println("cantidad de ingresos correctos: " + correcta);
        System.out.println("cantidad de ingresos incorrectos: " + incorrecta);
        
        
    }
    
}
