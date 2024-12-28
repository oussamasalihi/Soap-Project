package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.ArrayList;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroTooDh(11));
        Compte compte = proxy.getCompte(5);
        System.out.println("code : "+ compte.getCode());
        System.out.println("solde : "+ compte.getSolde());
        System.out.println("date de creation : "+ compte.getDateCreation());
        List<Compte> compteList = proxy.listComptes();
        for (Compte cpt : compteList){
            System.out.println("-----------");
            System.out.println("code : "+ cpt.getCode());
            System.out.println("solde : "+ cpt.getSolde());
            System.out.println("date de creation : "+ cpt.getDateCreation());
        }
    }
}
