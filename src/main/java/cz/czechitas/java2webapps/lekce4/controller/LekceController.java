package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Controller()
@RequestMapping("/lekce")
public class LekceController {

  private final LocalDate zacatekKurzu = LocalDate.of(2023, 9, 19);
  private final LocalTime casOd = LocalTime.of(18, 0);
  private final LocalTime casDo = LocalTime.of(20, 30);

  private final List<Lekce> seznamLekci = List.of(
          new Lekce("Vstup", "Mech a kapradí", zacatekKurzu.plusWeeks(0), casOd, casDo),
          new Lekce("Výstup", "Mech a kapradí", zacatekKurzu.plusWeeks(1), casOd, casDo),
          new Lekce("Příkazy", "Mech a kapradí", zacatekKurzu.plusWeeks(2), casOd, casDo),
          new Lekce("Podmínky", "Mech a kapradí", zacatekKurzu.plusWeeks(3), casOd, casDo),
          new Lekce("Cykly", "Mech a kapradí", zacatekKurzu.plusWeeks(4), casOd, casDo)
  );

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("/lekce/index");
    modelAndView.addObject("seznamLekci", seznamLekci);
    return modelAndView;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("/lekce/detail");
    modelAndView.addObject("lekce", seznamLekci.get(id));
    return modelAndView;
  }

}
