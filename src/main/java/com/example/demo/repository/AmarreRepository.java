package com.example.demo.repository;


import com.example.demo.model.Amarre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AmarreRepository extends JpaRepository <Amarre, Long> {
    //List<Amarre> findByID(Long id);
}
