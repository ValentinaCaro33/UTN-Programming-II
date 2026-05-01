/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author vale
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    // GETTERS 

    public String getNombre() { return nombre; }

    public String getEspecie() { return especie; }

    public int getEdad() { return edad; }
    
    // SETTERS

    public void setNombre(String nombre) {        
    // valida que no sea null ni este vacio
        if (nombre != null && !nombre.isBlank()){
             this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio.");
        }
    }

    public void setEspecie(String especie) {
    // valida que no sea null ni este vacio
        if (especie != null && !especie.isBlank()){
             this.especie = especie;
        } else {
            System.out.println("Error: la especie no puede estar vacio.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0){
            this.edad = edad;
        }else{
            System.out.println("Error: la edad no puede ser negativa.");
        }
    }
    
    // METODOS
    
    public void cumplirAnios(){
        edad += 1;
        System.out.println("Su mascota tiene " + edad + " años.");
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad);
    }
}
