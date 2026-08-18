package com.mycompany.taller.biblioteca;

public class Libro extends Material {

    private String autor;
    private boolean disponible;

   
    public Libro() {
    }

   
    public Libro(String codigo, String titulo, String aniopublic,
                 String autor, boolean disponible) {

        super(codigo, titulo, aniopublic);

        this.autor = autor;
        this.disponible = disponible;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

   
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}