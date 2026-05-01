/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author vale
 */
public class Estudiante {
    
  private String nombre;
  private String apellido;
  private String curso;
  private double calificacion;
  
   // GETTERS

    public String getNombre() { return nombre; }
    
    public String getApellido() { return apellido; }

    public String getCurso() { return curso; }
    
    public double getCalificacion() { return calificacion; }
    
   // SETTERS
    
    public void setNombre(String nombre) {
   // valida que no sea null ni este vacio
        if (nombre != null && !nombre.isBlank()){
             this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio.");
        }
    }

    public void setApellido(String apellido) {
    // valida que no sea null ni este vacio
        if (apellido != null && !apellido.isBlank()){
             this.apellido = apellido;
        } else {
            System.out.println("Error: el apellido no puede estar vacio.");
        }
    }

    public void setCurso(String curso) {
    // valida que no sea null ni este vacio
        if (curso != null && !curso.isBlank()){
             this.curso = curso;
        } else {
            System.out.println("Error: el curso no puede estar vacio.");
        }
    }

    public void setCalificacion(double calificacion) {
    // valida que el numero este entre 0.0 y 10.0
        if (calificacion >= 0.0 && calificacion <= 10.0){
          this.calificacion = calificacion;
        }else {
            System.out.println("Error: calificacion invalida.");
        }
    }
  
    // METODOS
    
    public void subirCalificacion(double puntos){
        if (calificacion + puntos <= 10.0){ // valida que no supere los 10.0
            calificacion += puntos;
        }else{
            System.out.println("Error: calificacion invalida.");
        }
    }
  
    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos >= 0.0) { // valida que no este debajo de 0.0
            calificacion -= puntos;
        } else {
            System.out.println("Error: calificacion invalida.");
        }
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nCurso: " + curso + "\nCalificacion: " + calificacion);
    }
}