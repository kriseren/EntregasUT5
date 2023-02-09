package com.example.entregasut5;

import com.example.entregasut5.model.Artista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaServiceImplementation implements ArtistaService
{
    @Autowired
    private ArtistaRepository ar;

    @Override
    public List<Artista> findAll() {
        return (List<Artista>)ar.findAll();
    }

    @Override
    public Optional<Artista> findByID(Long id) {
            return ar.findById(id);
    }

    @Override
    public void save(Artista a) {
        ar.save(a);
    }

    @Override
    public Artista update(Long id, Artista a) {
        if(ar.findById(id).isPresent())
            ar.save(a);
        return a;
    }

    @Override
    public void deleteById(Long id) {
        ar.deleteById(id);
    }
}
