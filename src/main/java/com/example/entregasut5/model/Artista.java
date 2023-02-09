package com.example.entregasut5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

@Entity(name = "artistas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artista
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private double cache;
    @Column
    private int edad;
}
