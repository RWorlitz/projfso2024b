package br.univille.projfso2024b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/clientes")
public class Clientecontroller {
    
    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("cliente/index");
    }
    
}
