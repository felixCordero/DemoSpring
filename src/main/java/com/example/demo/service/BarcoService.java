package com.example.demo.service;

import com.example.demo.model.Barco;
import com.example.demo.repository.BarcoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BarcoService {
    @Autowired
    private BarcoRepository barcoRepository;

    // Guardar un barco
    public Barco saveBarco(Barco barco) {
        return barcoRepository.save(barco);
    }
}
