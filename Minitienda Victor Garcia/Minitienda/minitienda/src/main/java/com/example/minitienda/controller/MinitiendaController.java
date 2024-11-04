package com.example.minitienda.controller;

import java.util.LinkedList;
import java.util.List;

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

    @GetMapping("/description")
    // @ResponseBody significa que el valor devuelto (el mensaje) será el cuerpo de la respuesta HTTP.
    @ResponseBody
    public String mostrarDescripcion() {
    return "En esta tienda podrás encontrar de todo, tenemos desde moviles hasta lavadoras ";
    }

    @GetMapping("/products")
    // @ResponseBody significa que el valor devuelto (el mensaje) será el cuerpo de la respuesta HTTP.
    @ResponseBody
    public List<String> mostrarProductos() {
        List<String> productos = new LinkedList<>();
        productos.add("Smart TV");
        productos.add("iPhone 15");
        productos.add("Lavadora Siemens");
        productos.add("Pipas");
        productos.add("Patinete eléctrico");
        return productos;
    }

    @GetMapping("/date")
    // @ResponseBody significa que el valor devuelto (el mensaje) será el cuerpo de la respuesta HTTP.
    @ResponseBody
    public String mostrarFecha() {
        return "Fecha actual: " + java.time.LocalDate.now();
    }
}
