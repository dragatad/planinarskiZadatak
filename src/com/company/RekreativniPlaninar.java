package com.company;

public class RekreativniPlaninar extends Planinar{

    /*težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg)
    •	naziv okruga odakle je rekreativni planinar
    •	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
    •	metoda uspjesanUspon - da li će rekreativni planinar uspešno popeti na planinu
        zavisi da li je njegov najveći uspon manji od visine planine,
        s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
     •	metoda clanarina - rekeativci placaju clanarinu u iznosu od 1000*/

    private int tezinaOpreme;
    private String okrug;
    private int maksUspon;
    private static final int clanarina = 1000;

    public RekreativniPlaninar() {
    }

    public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String okrug, int maksUspon) {
        super(id, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrug = okrug;
        this.maksUspon = maksUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getOkrug() {
        return okrug;
    }

    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }

    public int getMaksUspon() {
        return maksUspon;
    }

    public void setMaksUspon(int maksUspon) {
        this.maksUspon = maksUspon;
    }

    public boolean uspjesanUspon(Planina planina) {
        return maksUspon - (tezinaOpreme * 50) > planina.getVisinaPlanine();
    }

    public int clanarinaPlaninara(){
        return clanarina;
    }

    public void stampaj(){
        System.out.println("Rekreativac, id: " + getId()  + "\n" + " ime: " + getIme() + " " + getPrezime() + " Okrug: " + getOkrug());
    }



}
