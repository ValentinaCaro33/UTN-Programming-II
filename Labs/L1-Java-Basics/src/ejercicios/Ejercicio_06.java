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

public class Ejercicio_06 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2, divisionInt;
        double divisionDouble;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        
        divisionInt = num1 / num2;
        
        divisionDouble = (double) num1 / num2;
        
        System.out.println("Division entera: " + num1 + " / " + num2 + " = " + divisionInt + 
                "\nDivision con decimales: " + num1 + " / " + num2 + " = " + divisionDouble );
    }
    
}
