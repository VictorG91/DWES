package com.tuempresa.bibliodaw.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuempresa.bibliodaw.entities.Libro;;

public interface LibroRepository extends JpaRepository<Libro, Long> {


}
