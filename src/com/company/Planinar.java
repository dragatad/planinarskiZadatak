package com.company;

public abstract class Planinar {
    /*Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime
    Svi podaci smeju da se dohvate (GET),
    ali ne i postave (BEZ SET) mimo konstruktora koji postavlja sve attribute klase (PARAMETRIZOVAN KONSTRUKTOR).
    •	apstraktnu (ABSTRACT) metodu štampaj
    •	apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
    Metoda kao ulazni parametar prima objekat tipa Planina. */

    private int id;
    private String ime;
    private String prezime;

    public Planinar() {
    }

    public Planinar(int id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public abstract void stampaj();

    public abstract int clanarinaPlaninara();

    public abstract boolean uspjesanUspon(Planina planina);

    @Override
    public String toString() {
        return id + " " + ime + " " + prezime + " ";
    }
}
