package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lektor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/lektori")
public class LektoriController {
    private final List<Lektor> seznamLektoru = List.of(
            new Lektor("Víla", "Amálka", "workshopistka", "https://cdn.alza.cz/ImgW.ashx?fd=f16&cd=AKA264"),
            new Lektor("", "Sněhurka", "lektor", "https://www.irozhlas.cz/sites/default/files/styles/zpravy_otvirak_velky/public/uploader/safina_171220-235119_ber.jpg?itok=xvalICib"),
            new Lektor("", "Rákosníček", "kouč", null)
    );

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("/lektori/index");
        modelAndView.addObject("lektori", seznamLektoru);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/lektori/detail");
        modelAndView.addObject("lektor", seznamLektoru.get(id));
        return modelAndView;
    }

}
