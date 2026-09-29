package com.nutriexpress.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class Controller {

    @GetMapping // Pegar informações
    public String boasVindas(){
        return "Esssa é a minha primeira mensagem nessa rota";

    }
    
}
