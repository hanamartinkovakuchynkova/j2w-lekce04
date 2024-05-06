package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lektor;
import cz.czechitas.java2webapps.lekce4.entity.Ucastnik;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/ucastnici")
public class UcastniciController {

  private final List<Ucastnik> seznamUcastniku = List.of(
          new Ucastnik("Arabela", "Princezna", "zámek", "https://www.postavy.cz/foto/arabela-foto.jpg", "žena"),
          new Ucastnik("Xenie", "Princezna", "zámek", "https://www.postavy.cz/foto/xenie-foto.jpg", "žena"),
          new Ucastnik("Hyacint", "Král", "zámek", "https://www.postavy.cz/foto/hyacint-foto.jpg", "muž"),
          new Ucastnik("Rumburak", "Čaroděj", null, "https://www.postavy.cz/foto/rumburak-foto.jpg", "muž"),
          new Ucastnik("Blekota", "Čert", "peklo", "https://www.postavy.cz/foto/blekota-foto.jpg", "muž"),
          new Ucastnik("Mekota", "Čert", "peklo", "https://www.postavy.cz/foto/mekota-foto.jpg", "muž")
  );
  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("/ucastnici/index");
    modelAndView.addObject("ucastnici", seznamUcastniku);
    return modelAndView;
  }
  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("/ucastnici/detail");
    modelAndView.addObject("ucastnik", seznamUcastniku.get(id));
    return modelAndView;
  }

}
