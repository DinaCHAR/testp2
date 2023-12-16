package com.transport.analytics;

import java.util.List;


public class TransportReaderImpl implements ITransport {
	
	private List<String> getTypeVehicule;
	
	// Vélo implémentant l'interface Transport
	class Vélo implements ITransport {
	    private int vitesse;
	    private final String typeVehicule = "Terrestre"; 

	@Override
	public void démarrer() {
        System.out.println("Le vélo démarre en pédalant.");		
	}

	@Override
	public void accélérer() {
		System.out.println("Le vélo accélère en pédalant plus vite.");
		//la vitesse augmente 
        vitesse += 2;
		
	}

	@Override
	public void arrêter() {
		System.out.println("Le vélo s'arrête en freinant.");
		//le vélo s'arrête donc la vitesse et de 0 
        vitesse = 0;
	}
	
	@Override
    public int getVitesse() {
        return vitesse;
    }

	@Override
    public String getTypeVehicule() {
        return typeVehicule;
    	}
	}
	
	//Voiture implementel'interface transport
	
	class Voiture implements ITransport {
	    private int vitesse;
	    private final String typeVehicule = "Terrestre";
	    
	    @Override
	    public void démarrer() {
	        System.out.println("La voiture démarre en tournant la clé.");
	    }
	    
	    @Override
	    public void accélérer() {
	        System.out.println("La voiture accélère en appuyant sur la pédale d'accélérateur.");
	        vitesse += 10;
	    }
	    
	    @Override
	    public void arrêter() {
	        System.out.println("La voiture s'arrête en appuyant sur la pédale de frein.");
	        vitesse = 0; 
	    }
	    
	    @Override
	    public int getVitesse() {
	        return vitesse;
	    }

	    @Override
	    public String getTypeVehicule() {
	        return typeVehicule;
	    }
	}

	// Avion implémentant l'interface Transport
	class Avion implements ITransport {
	    private int vitesse;
	    private final String typeVehicule = "Aérien";

	    @Override
	    public void démarrer() {
	        System.out.println("L'avion démarre en augmentant la puissance des moteurs.");
	    }

	    @Override
	    public void accélérer() {
	        System.out.println("L'avion accélère en prenant de la vitesse sur la piste.");
	        vitesse += 80;
	    }

	    @Override
	    public void arrêter() {
	        System.out.println("L'avion s'arrête en ralentissant et en atterrissant.");
	        vitesse = 0;
	    }

	    @Override
	    public int getVitesse() {
	        return vitesse;
	    }

	    @Override
	    public String getTypeVehicule() {
	        return typeVehicule;
	    }
	    
	}
	
}

