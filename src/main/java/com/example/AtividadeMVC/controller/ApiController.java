package com.example.AtividadeMVC.controller;

import com.example.AtividadeMVC.models.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/animais")
public class ApiController {
    private List<Animal> animais = new ArrayList<>();

    public ApiController() {
        animais.add(new Animal("gato","branco",true,8));
        animais.add(new Animal("cachorro","preto",true,10));
        animais.add(new Animal("calopsita","verde",false,3));
        animais.add(new Animal("escorpião","amarelo",false,1));
    }
    @GetMapping
    public List<Animal> apiAnimais(){
        return animais;
    }
}
