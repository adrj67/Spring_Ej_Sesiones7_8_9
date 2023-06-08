
package com.ejercicios.sesion7_8_9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola mundo!!";
    }
}
