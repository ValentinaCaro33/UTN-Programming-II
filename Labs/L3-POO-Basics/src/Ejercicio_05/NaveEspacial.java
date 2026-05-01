/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author vale
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    
    public static final int CAPACIDAD_MAXIMA = 100;
    
    // GETTERS

    public String getNombre() { return nombre; }

    public int getCombustible() { return combustible; }
    
    // SETTERS

    public void setNombre(String nombre) {
    // valida que no este vacio o sea null
        if (nombre != null && !nombre.isBlank()){
             this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio.");
        }
    }

    public void setCombustible(int combustible) {
    // valida que no sea negativo
        if (combustible >= 0 && combustible <= CAPACIDAD_MAXIMA){
            this.combustible = combustible;
        }else{
            System.out.println("Error: cantidad invalida.");
        }
    }
    
    // METODOS 
    
    public void despegar(){
    // validar que haya combustible minimo para despegar
        if (combustible >= 5){
            combustible -= 5;
            System.out.println("Despegando...");
        }else{
            System.out.println("Error: No hay combustible suficiente para despegar.");
        }
    }
    
    public void avanzar(int distancia){
    // calcula el costo por km
        int costo = distancia * 2;
    // valida que haya suficiente combustible para esa distancia
        if (combustible >= costo){
            combustible -= costo;
            System.out.println("Avanzando con exito.");
        }else{
            System.out.println("Error: combustible insuficiente.");
        }
    }
    
    public void recargarCombustible(int cantidad){
    // valida que no sea negativo
        if (cantidad > 0 && cantidad + combustible <= CAPACIDAD_MAXIMA){
            combustible += cantidad;
            System.out.println("Recarga exitosa.");
        }else{
            System.out.println("Error: cantidad de combustible invalida.");
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Cantidad de combustible: " + combustible);
    }
}
