package com.example.football_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FootballController {
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private FutbolistaRepository futbolistaRepository;

    public FootballController(EquipoRepository equipoRepository, FutbolistaRepository futbolistaRepository) {
        this.equipoRepository = equipoRepository;
        this.futbolistaRepository = futbolistaRepository;
    }

    @GetMapping("/equipos")
    public String listarEquipos(Model model) {
        model.addAttribute("equipos", equipoRepository.findAll());
        return "equipos.html";
    }

    @GetMapping("/futbolistas")
    public String listarFutbolistas(Model model) {
        model.addAttribute("futbolistas", futbolistaRepository.findAll());
        return "futbolistas.html";
    }

    public EquipoRepository getEquipoRepository() {
        return equipoRepository;
    }

    public void setEquipoRepository(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    public FutbolistaRepository getFutbolistaRepository() {
        return futbolistaRepository;
    }

    public void setFutbolistaRepository(FutbolistaRepository futbolistaRepository) {
        this.futbolistaRepository = futbolistaRepository;
    }
}
