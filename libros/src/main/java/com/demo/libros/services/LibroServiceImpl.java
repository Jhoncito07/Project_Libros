package com.demo.libros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.libros.exceptions.LibroException;
import com.demo.libros.models.Libro;
import com.demo.libros.repositories.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    @Qualifier("libroRepositoryImpl")  // especifica cuál implementación usar
    private LibroRepository libroRepository;

    @Override
    public Libro getLibro(int id) {
        Libro libro = libroRepository.getLibro(id);
        if (libro == null) {
            throw new LibroException("El libro con ID " + id + " no se encuentra.");
        }
        return libro;
    }

    @Override
    public List<Libro> getLibros() {
        return libroRepository.getLibros();
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        return libroRepository.nuevLibro(libro);
    }
}
