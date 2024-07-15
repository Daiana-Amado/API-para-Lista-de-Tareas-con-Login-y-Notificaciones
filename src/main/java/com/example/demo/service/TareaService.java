
package com.example.demo.service;

import com.example.demo.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService implements ITareaService{
    
    @Autowired
    TareaRepository tareaRepo;
    
}
