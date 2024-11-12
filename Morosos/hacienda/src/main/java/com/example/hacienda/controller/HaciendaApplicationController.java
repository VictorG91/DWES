package main.java.com.example.hacienda.controller;

import java.util.List;

import main.java.com.Moroso;

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

        boolena morosoExiste = false;
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
    public String deleteMoroso(@RequestParam ("nombre") String nombre, Model model){
        Moroso morosoEncontrado = null;
        for(Moroso moroso : morosos){
            if(moroso.getNombre().equals(nombre)){
                morosoEncontrado = moroso;
            }
        }
        morosos.remove(morosoEncontrado);
        model.addAttribute("morososLista", morosos);

        return "index";
    }

    @PutMapping
    public String modificateMoroso(@RequestParam("nombre") String nombre, @RequestParam("deuda") double deuda, @RequestParam("dias") int dias, Model model){
        Moroso morosoEncontrado = null;
        for(Moroso moroso : morosos){
            if(moroso.getNombre().equals(nombre)){
                morosoEncontrado = moroso;
            }
        }
        morosos.remove(morosoEncontrado);
        Moroso morosoActualizado = new Moroso(nombre, deuda, dias);
        morosos.add(morosoActualizado);

        model.addAttribute("morososLista", morosos);

        return "index";
    }


}
