package com.senai.projetowebsenai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/sobre")
public class AboutController {

    public String index(){
        return "about/sobre";
    }
}
