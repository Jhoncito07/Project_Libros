package com.demo.libros.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.libros.models.Libro;

@Repository
public class LibroRepositoryDemo implements LibroRepository {

    private final List<Libro> libros = new ArrayList<>();
    public LibroRepositoryDemo() {
        libros.add(new Libro(1, "El señor de los anillos", "J.R.R. Tolkien", "Minotauro", 1954));
        libros.add(new Libro(2, "Harry Potter y la piedra filosofal", "J.K. Rowling", "Salamandra", 1997));
        libros.add(new Libro(3, "Orgullo y prejuicio", "Jane Austen", "Penguin Clásicos", 1813));
        libros.add(new Libro(4, "Crónica de una muerte anunciada", "Gabriel García Márquez", "Sudamericana", 1981));
        libros.add(new Libro(5, "Las aventuras de Sherlock Holmes", "Arthur Conan Doyle", "Alba Editorial", 1892));

    }

    @Override
    public Libro getLibro(int id) {
        System.out.println("Estableciendo conexión con la base de datos Oracle.");
        for (Libro libro : libros) {
            if (id == libro.getId())
                return libro;

        }

        return null;
    }

    @Override
    public List<Libro> getLibros() {
        System.out.println("Estableciendo conexión con la base de datos Oracle.");
        return libros;
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
