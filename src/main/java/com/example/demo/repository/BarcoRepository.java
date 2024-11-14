package com.example.demo.repository;

import com.example.demo.model.Barco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BarcoRepository extends JpaRepository<Barco, Long> {
    List<Barco> findByNombre(String nombre);
    List<Barco> findByEsloraGreaterThan(Integer eslora);
    List<Barco> findByNombreOrderByCapacidadDesc(String nombre);
}
