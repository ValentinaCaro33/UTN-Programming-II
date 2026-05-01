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
public class Ejercicio_05 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num, total;
        total = 0;
        
        do {
            System.out.println("Ingrese un numero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            
            if (num % 2 == 0){
                total += num;
            }
            
        } while (num != 0);
 
        System.out.println("La suma de los numeros pares es " + total);
    }
    
}
