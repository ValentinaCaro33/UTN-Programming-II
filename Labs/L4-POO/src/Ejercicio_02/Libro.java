package Ejercicio_02;

public class Libro {
    private String titulo;
    private String autor;
    private static String editorial = "Independiente";

    // GETTERS

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getEditorial() { return editorial; }

    // SETTERS

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()){
            System.out.println("ERROR: el titulo no puede estar vacio.");
        } else{
            this.titulo = titulo;
        }
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty()){
            System.out.println("ERROR: el autor no puede estar vacio.");
        } else{
            this.autor = autor;
        }
    }

    // CONSTRUCTORES

    public Libro(String titulo, String autor) {
    setTitulo(titulo);
    setAutor(autor);
    }

    public Libro(String titulo, String autor, String editorial) {
        this(titulo, autor);
        Libro.editorial = editorial;
    }

    // METODOS

    public void actualizarTitulo(String nuevoTitulo){
        setTitulo(nuevoTitulo);
    }

    public void actualizarTitulo(String prefijo, String nuevoTitulo){
        setTitulo(prefijo + " " + nuevoTitulo);
    }

    public static void cambiarEditorial(String nueva){
        if (nueva == null || nueva.isEmpty()){
            System.out.println("ERROR: la editorial no puede estar vacia");
        } else {
            Libro.editorial = nueva;
        }
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + " | Autor: " + autor + " | Editorial: " + editorial;
    }

}
