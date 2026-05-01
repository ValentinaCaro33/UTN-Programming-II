/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author vale
 */
public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    // GETTERS

    public String getIdGallina() { return idGallina; }

    public int getEdad() { return edad; }

    public int getHuevosPuestos() { return huevosPuestos; }
    
    // SETTERS

    public void setIdGallina(String idGallina) {
    // valida que no este vacio o sea null
        if (idGallina != null && !idGallina.isBlank()){
            this.idGallina = idGallina;
        }else{
            System.out.println("Error: el id no puede estar vacio.");
        }
    }

    public void setEdad(int edad) {
    // valida que no sea negativo
        if (edad >= 0){
            this.edad = edad;
        }else{
            System.out.println("Error: la edad no puede ser negativa.");
        }
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0){
            this.huevosPuestos = huevosPuestos;
        }else{
            System.out.println("Error: la cantidad no puede ser negativa.");
        }
    }
    
    // METODOS
    
    public int ponerHuevo(int huevo){
        huevosPuestos += huevo;
        return huevosPuestos;
    }
    
    public int envejecer(){
        edad += 1;
        return edad;
    }
    
    public void mostrarEstado(){
        System.out.println("Id: " + idGallina + "\nEdad: " + edad + "\nHuevos Puestos: " + huevosPuestos);
    }
}
