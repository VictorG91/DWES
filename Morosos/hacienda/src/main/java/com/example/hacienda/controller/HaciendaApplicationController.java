package com.example.hacienda.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Moroso;


@Controller
public class HaciendaApplicationController {

    private List<Moroso> morosos = new LinkedList<Moroso>();

    @GetMapping("/")
    public String getMorosos(Model model) {
        model.addAttribute("morososLista", morosos);
        return "index";
    }

    @PostMapping("/addMoroso")
    public String postMoroso(@RequestParam("nombre") String nombre, @RequestParam("deuda") double deuda, @RequestParam("dias") int dias, Model model){

        boolean morosoExiste = false;
        for (Moroso moroso : morosos) {
            if (moroso.getNombre().equals(nombre)){
                morosoExiste = true;
            }
        }
        if(morosoExiste == true){
            model.addAttribute("morososLista", morosos);
            return "index";
        } else {
            Moroso moroso = new Moroso(nombre, deuda, dias);
            morosos.add(moroso);

            model.addAttribute("morososLista", morosos);

            return "index";
        }
    }

    @PostMapping("/deleteMoroso")
    public String deleteMoroso(@RequestParam ("id") int id, Model model){
        Moroso morosoEncontrado = null;
        for(Moroso moroso : morosos){
            if(moroso.getId() == id){
                morosoEncontrado = moroso;
            }
        }
        morosos.remove(morosoEncontrado);
        model.addAttribute("morososLista", morosos);

        return "index";
    }

    @PostMapping("/modificarMoroso")
    public String modificaMoroso(@RequestParam("id") int id, @RequestParam("deuda") double deuda, @RequestParam("dias") int dias, Model model){
        if(id <= morosos.size()){
            Moroso morosoEncontrado = null;
            for(Moroso moroso : morosos){
                if(moroso.getId() == id){
                    morosoEncontrado = moroso;
                }
            }
            morosoEncontrado.setDeuda(deuda);
            morosoEncontrado.setDias(dias);
        }

        model.addAttribute("morososLista", morosos);

        return "index";
    }


}
