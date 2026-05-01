/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author vale
 */
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.setNombre(" ");
        estudiante1.setApellido(null);
        estudiante1.setCalificacion(15.0);
        
        estudiante1.mostrarInfo();
        
        estudiante1.setNombre("Valentina");
        estudiante1.setApellido("Caro");
        estudiante1.setCurso("2A");
        estudiante1.setCalificacion(8.5);
        
        estudiante1.mostrarInfo();
        
        estudiante1.subirCalificacion(3);
        estudiante1.mostrarInfo();
        
        estudiante1.subirCalificacion(1.5);
        estudiante1.mostrarInfo();
        
        estudiante1.bajarCalificacion(11);
        estudiante1.mostrarInfo();
        
        estudiante1.bajarCalificacion(2);
        estudiante1.mostrarInfo();

    }
}
