/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author vale
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public static final int AÑO_ACTUAL = 2026; // constante para poder modificarla facilmente
    
    // GETTERS

    public String getTitulo() { return titulo; }

    public String getAutor() { return autor; }

    public int getAñoPublicacion() { return añoPublicacion; }
    
    // SETTERS 

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isBlank()){
             this.titulo = titulo;
        } else {
            System.out.println("Error: el titulo no puede estar vacio.");
        }
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isBlank()){
             this.autor = autor;
        } else {
            System.out.println("Error: el autor no puede estar vacio.");
        }
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= AÑO_ACTUAL){
            this.añoPublicacion = añoPublicacion;
        }else{
            System.out.println("Error: año invalido.");
        }
    }
    
    // METODOS
    
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAño de publicacion:  " + añoPublicacion);
    }
}
