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
public class Ejercicio14 {
    public static void main(String[] args) {
        
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
        */
        
          Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese monto para cambiar ");

        double monto = leer.nextDouble();

        libra(monto);
        usd(monto);
        yen(monto);
    }

    //funcion para libras
    public static double libra(double monto) {

        double resultado = monto * 0.86;
        System.out.println("El valor convertido de " + monto + " euros a  Libras es: " + resultado);
        return resultado;

    }

    //funcion para usd
    public static double usd(double monto) {
        double resultado2 = monto * 1.28611;
        System.out.println("El valor convertido de " + monto + " euros a  Dolares es: " + resultado2);
        return resultado2;
    }

    //funcion para yen
    public static double yen(double monto) {
        double resultado3 = monto * 129.852;
        System.out.println("El valor convertido de " + monto + " euros a  Yenes es: " + resultado3);
        return resultado3;
    }

}
