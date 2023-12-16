package com.transport.analytics;

import java.util.List;


public interface ITransport {

	void démarrer ();
	void accélérer ();
	void arrêter ();
	
	//obtenir la valeur actuelle du transport 
	int getVitesse ();
	
	List<String> getTypeVehicule();
}
