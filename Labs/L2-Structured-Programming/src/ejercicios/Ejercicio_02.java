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
public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1, num2, num3, mayor;
        
        System.out.println("Ingrese el primer numero:");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero:");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el tercer numero:");
        num3 = Integer.parseInt(input.nextLine());
        
        mayor = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        } 
        
        if (num3 > mayor){
            mayor = num3;
        }
        
        System.out.println("El mayor es " + mayor);
    }
}
