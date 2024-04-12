package br.univille.projfso2024b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Respogit nseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping("/")
    //@ResponseBody
    public ModelAndView index(){
        var msg = "Quem diria que deu certo";
        return new ModelAndView("home/index","apelido", msg);
    }

}
