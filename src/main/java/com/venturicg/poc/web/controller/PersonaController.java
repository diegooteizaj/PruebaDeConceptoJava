package com.venturicg.poc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PersonaController {
    @RequestMapping("/persona")
    public String home() {
        return "persona";
    }
}
