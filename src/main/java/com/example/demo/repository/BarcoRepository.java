package com.example.demo.repository;

import com.example.demo.model.Barco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BarcoRepository extends JpaRepository<Barco, Long> {
    List<Barco> findByNombre(String nombre);
    List<Barco> findByEsloraGreaterThan(Integer eslora);
    List<Barco> findByNombreOrderByCapacidadDesc(String nombre);
    @Query("SELECT b FROM Barco b WHERE b.nombre = :nombre")
    List<Barco> findByNombre2(@Param("nombre") String nombre);
    @Query("SELECT b FROM Barco b WHERE b.eslora > :eslora")
    List<Barco> findByEsloraGreaterThan2(@Param("eslora") Integer
                                                eslora);
    @Query(value = "SELECT * FROM Barco b WHERE b.nombre = :nombre ORDER BY b.capacidad DESC", nativeQuery = true) //SQL
            List<Barco> findByNombreOrderByCapacidadDesc2(@Param("nombre")
            String nombre);
}
