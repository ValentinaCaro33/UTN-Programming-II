/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author vale
 */
public class Main {
    public static void main(String[] args) {
        Libro a = new Libro();
        
        a.setTitulo("Dracula");
        a.setAutor("Bram Stoker");
        a.setAñoPublicacion(0);
        a.mostrarInfo();
        
        a.setAñoPublicacion(2038);
        a.mostrarInfo();
        
        a.setAñoPublicacion(1897);
        a.mostrarInfo();
        
    }
}
