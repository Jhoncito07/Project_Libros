package com.demo.libros.models;

public class BookCreationResponse {
    private Libro libro;
    private String estado;

    public BookCreationResponse(Libro libro, String estado) {
        this.libro = libro;
        this.estado = estado;
    }

    // Getters y setters
    public Libro getLibro() {
        return this.libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

