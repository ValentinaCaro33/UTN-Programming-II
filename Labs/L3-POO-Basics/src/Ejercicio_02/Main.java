/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author vale
 */
public class Main {
    public static void main(String[] args) {
        Mascota a = new Mascota();
        
        a.setEdad(-5);
        a.setEspecie(" ");
        a.mostrarInfo();
        
        a.setNombre("Copito");
        a.setEspecie("Gato");
        a.setEdad(3);
        a.mostrarInfo();
        
        a.cumplirAnios();
        a.cumplirAnios();
        a.cumplirAnios();
        a.mostrarInfo();
    }
}
