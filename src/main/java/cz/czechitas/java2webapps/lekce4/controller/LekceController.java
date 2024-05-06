package cz.czechitas.java2webapps.lekce4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller()
@RequestMapping("/lekce")
public class LekceController {
    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("/lekce/index");
        return modelAndView;
    }
}
