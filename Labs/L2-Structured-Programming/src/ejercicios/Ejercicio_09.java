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
public class Ejercicio_09 {
    
    public static double calcularCostoEnvio (double peso, String zona){
        double costo;
        costo = 0;
                
        if (zona.equalsIgnoreCase("NACIONAL")){
            costo = peso * 5;
        }else if (zona.equalsIgnoreCase("INTERNACIONAL")){
            costo = peso * 10;
        }
        return costo;
    }
    
    public static double calcularTotalCompra (double precioProducto, double costoEnvio){
        return costoEnvio + precioProducto;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double precioProducto, peso, costoEnvio, total;
        String zona;
            
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la zona de envío (Nacional o Internacional): ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
}
