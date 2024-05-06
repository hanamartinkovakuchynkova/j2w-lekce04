package cz.czechitas.java2webapps.lekce4.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Lekce {
  private String nazev;
  private String misto;
  private LocalDate datum;
  private LocalTime casOd;
  private LocalTime casDo;

  public Lekce() {
  }

  public Lekce(String nazev, String misto, LocalDate datum, LocalTime casOd, LocalTime casDo) {
    this.nazev = nazev;
    this.misto = misto;
    this.datum = datum;
    this.casOd = casOd;
    this.casDo = casDo;
  }

  public String getNazev() {
    return nazev;
  }

  public void setNazev(String nazev) {
    this.nazev = nazev;
  }

  public String getMisto() {
    return misto;
  }

  public void setMisto(String misto) {
    this.misto = misto;
  }

  public LocalDate getDatum() {
    return datum;
  }

  public void setDatum(LocalDate datum) {
    this.datum = datum;
  }

  public LocalTime getCasOd() {
    return casOd;
  }

  public void setCasOd(LocalTime casOd) {
    this.casOd = casOd;
  }

  public LocalTime getCasDo() {
    return casDo;
  }

  public void setCasDo(LocalTime casDo) {
    this.casDo = casDo;
  }
}
