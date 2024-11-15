package com.example.demo.service;

import com.example.demo.repository.AmarreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmarreService {
    @Autowired
    private AmarreRepository amarreRepository;
}
