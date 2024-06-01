package com.demo.libros.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.libros.exceptions.LibroException;
import com.demo.libros.models.Libro;
import com.demo.libros.services.LibroService;

@RestController
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libros")
    public List<Libro> getLibros() {
        return libroService.getLibros();
    }

    @GetMapping("/libros/{id}")
    public Libro getLibro(@PathVariable int id) {
        Libro libro = libroService.getLibro(id);
        if (libro == null) {
            throw new LibroException("El libro con ID " + id + " no se encuentra.");
        }
        return libro;
    }

    @PostMapping("/libros")
public ResponseEntity<Map<String, Object>> nuevLibro(@RequestBody Libro libro) {
    Libro nuevoLibro = libroService.nuevLibro(libro);
    
    Map<String, Object> response = new HashMap<>();
    response.put("libro", nuevoLibro);
    response.put("estado", "CREATE");

    return ResponseEntity.status(HttpStatus.CREATED).body(response);
}

}
