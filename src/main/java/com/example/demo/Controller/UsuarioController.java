
package com.example.demo.Controller;

import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioService usuServ;
}
