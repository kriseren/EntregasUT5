package com.example.entregasut5.controller;

import com.example.entregasut5.ArtistaServiceImplementation;
import com.example.entregasut5.model.Artista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController
{
    @Autowired
    private ArtistaServiceImplementation asi;

    @GetMapping("/artistas")
    public List<Artista> lista()
    {
        return asi.findAll();
    }

    @PostMapping("/alta")
    public String alta(Artista a)
    {
        asi.save(a);
        return "Artista agregado correctamente";
    }

    @PutMapping("/modifica/{id}")
    public Artista modifica(@PathVariable Long id, Artista a)
    {
        return asi.update(id,a);
    }

    @DeleteMapping("/elimina/{id}")
    public String elimina(@PathVariable Long id)
    {
        asi.deleteById(id);
        return "Artista eliminado correctamente";
    }
}
