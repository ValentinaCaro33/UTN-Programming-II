/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author vale
 */
public class Main {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        
        nave.setCombustible(50);
        nave.despegar();
        
        nave.mostrarEstado();
        
        nave.avanzar(25);
        nave.recargarCombustible(100);
        nave.avanzar(5);
        
        nave.mostrarEstado();
        
        nave.recargarCombustible(50);
        nave.mostrarEstado();
    }
}
