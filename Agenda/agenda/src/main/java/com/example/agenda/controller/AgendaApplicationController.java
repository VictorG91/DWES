package com.example.agenda.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.agenda.Contacto;


@Controller
public class AgendaApplicationController {

    private List<Contacto> contactos = new LinkedList<Contacto>();

   @GetMapping("/")
    public String getContactos(Model model) {
        model.addAttribute("contactList", contactos);
        return "index";
    }

    @PostMapping("/searchContact")
    public String getContacto(@RequestParam ("searchName") String name, Model model) {
        Contacto contactoEncontrado = null;
        for (Contacto contact : contactos) {
            if (contact.getName().equals(name)) {
                contactoEncontrado = contact;
            }
        }

        model.addAttribute("contactList", contactos);
        model.addAttribute("contactDetail", contactoEncontrado);

        return "index";
    }

    @PostMapping("/addContact")
    public String postContact(@RequestParam("name") String name,
                            @RequestParam("phone") String phone, Model model){
        
        Contacto contacto = new Contacto(name, phone);
        contactos.add(contacto);

        model.addAttribute("contactList", contactos);

        return "index";
    }

    @PostMapping("/deleteContact")
    public String deleteContacto(@RequestParam ("name") String name, Model model) {
        Contacto contactoEncontrado = null;
        for (Contacto contact : contactos) {
            if (contact.getName().equals(name)) {
                contactoEncontrado = contact;
            }
        }
        contactos.remove(contactoEncontrado);
        model.addAttribute("contactList", contactos);

        return "index";
    }
}
