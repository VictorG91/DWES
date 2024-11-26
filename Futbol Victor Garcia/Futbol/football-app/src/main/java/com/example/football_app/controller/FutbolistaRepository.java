
package com.example.football_app.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.football_app.Futbolista;

@Repository
public interface FutbolistaRepository extends JpaRepository<Futbolista, Long> {
}