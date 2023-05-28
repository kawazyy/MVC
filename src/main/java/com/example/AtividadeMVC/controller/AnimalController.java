package com.example.AtividadeMVC.controller;

import com.example.AtividadeMVC.models.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/animais")
public class AnimalController {
    private List<Animal> animais = new ArrayList<>();

    public AnimalController() {
        animais.add(new Animal("gato","branco",true,8));
        animais.add(new Animal("cachorro","preto",true,10));
        animais.add(new Animal("calopsita","verde",false,3));
        animais.add(new Animal("escorpião","amarelo",false,1));
    }
    @GetMapping
    public String animais(Model model){
        model.addAttribute("animais",animais);
        return "Animais";
    }
}
