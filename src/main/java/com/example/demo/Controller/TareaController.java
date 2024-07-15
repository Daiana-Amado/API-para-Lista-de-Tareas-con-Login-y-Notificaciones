
package com.example.demo.Controller;

import com.example.demo.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TareaController {
    
    @Autowired
    TareaService tareaServ;
}
