package com.company;

public class Planina {
    /*Kreirati klasu Planina koju opisuju ime planine,
    naziv države u kojoj se nalazi i visina planine.
    Klasa mora imati konstruktore i getere i setere.*/

    private String ime;
    private String drzava;
    private int visinaPlanine;

    public Planina() {
    }

    public Planina(String ime, String drzava, int visinaPlanine) {
        this.ime = ime;
        this.drzava = drzava;
        this.visinaPlanine = visinaPlanine;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        if (visinaPlanine > 0) {
            this.visinaPlanine = visinaPlanine;
        } else {
            System.out.println("Nevalidan unos!");
        }
    }
}
