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

public class Ejercicio_03 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nombre;
        int edad;
        
        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
    }
}
