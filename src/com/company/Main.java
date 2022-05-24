package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//instancirati jednu planinu

        Planina planina1 = new Planina("Trebevic", "BiH",1600);

        //napraviti nizili listu koji ce sadrzati najmanje tri rekrativna planinara I tri alpiniste

        RekreativniPlaninar rplaninar1 = new RekreativniPlaninar(7896,"Mitar","Mitrovic",30,
                "Unsko-sanski",100);
        RekreativniPlaninar rplaninar2 = new RekreativniPlaninar(6549,"Marko","Markovic",36,
                "Sarajevski",850);
        RekreativniPlaninar rplaninar3 = new RekreativniPlaninar(1234,"Petar","Petrovic",42,
                "Brcanski", 1250);

        Alpinista aplaninar1 = new Alpinista(4569,"Dusan","Dusankovic",25);
        Alpinista aplaninar2 = new Alpinista(4656,"Bojan","Bojanic",16);
        Alpinista aplaninar3 = new Alpinista(7989, "Novak", "Novakovic",56);

        ArrayList<Planinar>planinari = new ArrayList<>();
        planinari.add(rplaninar1);
        planinari.add(rplaninar2);
        planinari.add(rplaninar3);
        planinari.add(aplaninar1);
        planinari.add(aplaninar2);
        planinari.add(aplaninar3);
        System.out.println(planinari);

        //ispisati podatke o svim planinarima
        rplaninar1.stampaj();
        rplaninar2.stampaj();
        rplaninar3.stampaj();

        //aplaninar1.stampaj();
        //aplaninar2.stampaj();
        //aplaninar3.stampaj();

        //za svakog od planinara ispisati da li ce se popeti na instanciranu planinu
        for(Planinar p : planinari){
            if(p.uspjesanUspon(planina1)){
                System.out.println("Uspjesan uspon!");
            }else{
                System.out.println("Neuspjesan uspon!");
            }
        }
        rplaninar1.uspjesanUspon(planina1);
        rplaninar2.uspjesanUspon(planina1);
        rplaninar3.uspjesanUspon(planina1);
        aplaninar1.uspjesanUspon(planina1);
        aplaninar2.uspjesanUspon(planina1);
        aplaninar3.uspjesanUspon(planina1);

        //ispisati koliki je zbir svih clanarina planinara iz niza/liste

        int zbirClanarina = 0;
        for(Planinar p : planinari){
           zbirClanarina += p.clanarinaPlaninara();
            }
        System.out.println(zbirClanarina);

















    }
}
