package cz.czechitas.java2webapps.lekce4.entity;

public class Lektor {
    private String jmeno;
    private String prijmeni;
    private String role;
    private String profilovyObrazek;

    public Lektor() {
    }

    public Lektor(String jmeno, String prijmeni, String role, String profilovyObrazek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.role = role;
        this.profilovyObrazek = profilovyObrazek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProfilovyObrazek() {
        return profilovyObrazek;
    }

    public void setProfilovyObrazek(String profilovyObrazek) {
        this.profilovyObrazek = profilovyObrazek;
    }
}
