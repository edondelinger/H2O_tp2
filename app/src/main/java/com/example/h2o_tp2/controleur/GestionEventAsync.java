package com.example.h2o_tp2.controleur;

import java.util.ArrayList;

// Force la classe qui l'implemente a avoir les methodes indiquees ci-dessous
// Cette methode sera appelee lorsque la tache asynchrone sera terminee
public interface GestionEventAsync { 
	public void onTacheTerminee(String resultat);

}
