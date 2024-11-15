package com.example.demo.repository;


import com.example.demo.model.Regata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegataRepository extends JpaRepository <Regata, Long> {
    List<Regata> findByNombre(String nombre);
}
