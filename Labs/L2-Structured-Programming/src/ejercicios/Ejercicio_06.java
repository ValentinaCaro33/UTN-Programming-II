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
        int num, totalPos, totalNeg, totalCero;
        totalPos = 0;
        totalNeg = 0;
        totalCero = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            num = Integer.parseInt(input.nextLine());
            
            if (num == 0) {
                totalCero += 1;
            }else if (num < 0){
                totalNeg += 1;
            }else if (num > 0){
                totalPos += 1;
            }
        }
        
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + totalPos);
        System.out.println("Negativos: " + totalNeg);
        System.out.println("Ceros: " + totalCero);
    }
    
}
