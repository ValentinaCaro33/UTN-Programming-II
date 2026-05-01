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

public class Ejercicio_07 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // ERROR. Al ser un string, la forma correcta es "scanner.nextLine()",
                                            // ya que "nextInt()" se usa para numeros enteros.
        System.out.println("Hola, " + nombre);
        
    }
    
}
