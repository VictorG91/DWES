package com.example.gestionpistas.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.gestionpistas.Pista;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class GestionPistasController {

    private List<Pista> pistas = new LinkedList<Pista>();

    @GetMapping("/")
    public String getPistas(Model model) {
        model.addAttribute("listasPistas", pistas);
        return "index";
    }

    @PostMapping("/addPista")
    public String postPista(@RequestParam("nombrePista") String nombrePista,
                            @RequestParam("horas") String horasDisponibles, Model model){
        
        Pista pista = new Pista(nombrePista, horasDisponibles);
        pistas.add(pista);

        model.addAttribute("listaPistas", pistas);

        return "index";
    }
    
}
