package com.example.demo.service;


import com.example.demo.repository.RegataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegataService {
    @Autowired
    private RegataRepository regataRepository;

}
