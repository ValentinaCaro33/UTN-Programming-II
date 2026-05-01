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

public class Ejercicio_04 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2, suma, resta, mult, div;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicacion: " + num1 + " * " + num2 + " = " + mult);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + div);
    }
}
