/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author vale
 */
public class Main {
    public static void main(String[] args) {
        Gallina gallinaA = new Gallina();
        Gallina gallinaB = new Gallina();
        
        gallinaA.setEdad(-5);
        gallinaB.setIdGallina(" ");
        
        gallinaA.setIdGallina("154A");
        gallinaB.setIdGallina("865B");
        gallinaA.setEdad(2);
        gallinaB.setEdad(4);
        gallinaA.ponerHuevo(2);
        gallinaB.ponerHuevo(1);
        
        gallinaA.mostrarEstado();
        gallinaB.mostrarEstado();
        
        gallinaB.ponerHuevo(5);
        gallinaB.mostrarEstado();
    }
}
