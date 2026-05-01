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
        Scanner input = new Scanner (System.in);
        int nota;
        boolean valido;
        
        do {
            System.out.println("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            valido = nota > 0 && nota < 10;
            
            if (valido) {
                System.out.println("Nota guardada correctamente.");
            }else{
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }
            
        } while (valido == false);
    }
    
}
