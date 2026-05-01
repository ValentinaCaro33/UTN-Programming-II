/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author vale
 */

public class Ejercicio_01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num;
        
        System.out.println("Ingrese un año: ");
        num = Integer.parseInt(input.nextLine());
        
        if (num % 4 == 0) {
            if (num % 100 == 0) {
                if (num % 400 == 0) {
                    System.out.println("El año " + num + " es bisiesto.");
                } else {
                    System.out.println("El año " + num + " no es bisiesto.");
                }
            } else {
                System.out.println("El año " + num + " es bisiesto.");
            }
        } else {
            System.out.println("El año " + num + " no es bisiesto.");
        }
        
//        tambien se podria hacer de esta forma mas simple con operadores logicos:
//
//        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
//            System.out.println("El año " + num + " es bisiesto");
//        } else {
//             System.out.println("El año " + num + " no es bisiesto");
//        }
//        
                
    }
}
