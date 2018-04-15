/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto8;

/**
 *
 * @author Martin
 */
public class Libro {
    private String ISBN;
    private String autor;
    private String titulo;
    private double precio;
    
    public Libro(String ISBN, String autor, String titulo, double precio) 
    {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
    }
    
    public Libro() {
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
