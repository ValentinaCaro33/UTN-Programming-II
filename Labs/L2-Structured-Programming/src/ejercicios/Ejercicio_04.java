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
        double precio, total, descuento;
        String categoria;
        
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese su categoría (A, B o C): ");
        categoria = input.nextLine().toUpperCase(); // valida la entrada aunque esté en minuscula
                
        switch (categoria) {
            case "A" -> {
                descuento = precio * 0.10;
                System.out.println("Descuento aplicado: 10%");
            }
            case "B" -> {
                descuento = precio * 0.15;
                System.out.println("Descuento aplicado: 15%");
            }
            case "C" -> {
                descuento = precio * 0.20;
                System.out.println("Descuento aplicado: 20%");
            }
            default -> {
                System.out.println("Categoria invalida");
                throw new AssertionError();
            }   
        }
        
        total = precio - descuento;
        System.out.println("Precio inicial: " + precio);
        System.out.println("Precio final: " + total);
    }
}
