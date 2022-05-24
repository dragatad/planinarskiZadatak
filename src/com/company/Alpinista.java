package com.company;

public class Alpinista extends Planinar {
    /*koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost)
    i poeni se mogu menjati kroz adekvatnu metodu(SET).
     *Alpinista može da savlada sve uspone do 4000 metara,
     placa clanarinu u iznosu od 1500
     pritom za svaki poen ima popust od 50
    *Alpinista, id: id
ime: ime i prezime
Broj poena: poeni
    * */


    private int poeni;

    public Alpinista() {
    }

    public Alpinista(int id, String ime, String prezime, int poeni) {
        super(id, ime, prezime);
        this.poeni = poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    public void stampaj() {
        System.out.println("Alpinista, id: " + getId() + "\n" + " ime: " + getIme() + " " + getPrezime() + "\n"
                + " Broj poena: " + poeni);
    }

    public int clanarinaPlaninara() {
        int clanarina = 1500 - (poeni * 50);
        if(clanarina > 0)
            return clanarina;
        else{
            return 0;
        }
    }

    public boolean uspjesanUspon(Planina planina) {
        if (planina.getVisinaPlanine() <= 4000) {
            return true;
        } else {
            return false;
        }
    }

}
