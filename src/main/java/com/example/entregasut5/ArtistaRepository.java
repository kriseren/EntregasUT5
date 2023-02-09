package com.example.entregasut5;

import com.example.entregasut5.model.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ArtistaRepository extends CrudRepository<Artista,Long>
{
}
