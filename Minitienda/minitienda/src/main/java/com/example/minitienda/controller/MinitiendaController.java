package com.example.minitienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// La anotación @Controller indica que esta clase es un controlador.
@Controller
public class MinitiendaController {
    // La anotación @GetMapping vincula la ruta /bienvenida con este método.
    @GetMapping("/hello")
    // @ResponseBody significa que el valor devuelto (el mensaje) será el cuerpo de la respuesta HTTP.
    @ResponseBody
    public String mostrarBienvenida() {
    // Este método simplemente devuelve un mensaje de bienvenida.
    return "¡Bienvenido a Minitienda!";
    }
}
