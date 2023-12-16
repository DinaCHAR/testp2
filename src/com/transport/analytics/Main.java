package com.transport.analytics;

import com.transport.analytics.TransportReaderImpl.Avion;
import com.transport.analytics.TransportReaderImpl.Voiture;
import com.transport.analytics.TransportReaderImpl.Vélo;

public class Main {
    public static void main(String args[]) {
        Vélo vélo = new Vélo();
        Voiture voiture = new Voiture();
        Avion avion = new Avion();

        vélo.démarrer();
        vélo.accélérer();
        System.out.println("Vitesse du vélo : " + vélo.getVitesse() + " km/h");
        System.out.println("Type de véhicule : " + vélo.getTypeVehicule());
        vélo.arrêter();

        voiture.démarrer();
        voiture.accélérer();
        System.out.println("Vitesse de la voiture : " + voiture.getVitesse() + " km/h");
        System.out.println("Type de véhicule : " + voiture.getTypeVehicule());
        voiture.arrêter();

        avion.démarrer();
        avion.accélérer();
        System.out.println("Vitesse de l'avion : " + avion.getVitesse() + " km/h");
        System.out.println("Type de véhicule : " + avion.getTypeVehicule());
        avion.arrêter();
    }
}
