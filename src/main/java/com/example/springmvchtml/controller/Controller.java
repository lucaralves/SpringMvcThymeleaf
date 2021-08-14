package com.example.springmvchtml.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
@RequestMapping("/api")
public class Controller {

    /*@GetMapping("/html")
    String getHtml(Model model) {

        model.addAttribute("texto", "Olá Mundo !!!");
        return "webcontent";

    }*/

    @RequestMapping(value = "/html",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
    public String getCursos(Model model) {
        try {
            model.addAttribute("texto", "Olá Mundo !!!");
            return "webcontent";
        } catch (Exception e) {
            return "erro";
        }
    }
}


