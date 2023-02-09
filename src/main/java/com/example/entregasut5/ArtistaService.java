package com.example.entregasut5;

import com.example.entregasut5.model.Artista;

import java.util.List;
import java.util.Optional;

public interface ArtistaService
{
    //Método que devuelve todos los artistas de la base de datos.
    List<Artista> findAll();
    //Método que devuelve (o no) un artista asignado a un Id.
    Optional<Artista> findByID(Long id);

    /**
     * Método que guarda un artista en la base de datos.
     * @param a El artista a guardar.
     */
    void save(Artista a);

    /**
     * Método que actualiza un artista.
     * @param id El identificador del artista a modificar.
     * @param a El objeto artista con los atributos nuevos.
     * @return El artista modificado.
     */
    Artista update(Long id, Artista a);

    /**
     * Método que elimina un artista.
     * @param id El identificador del artista a eliminar.
     */
    void deleteById(Long id);

}
