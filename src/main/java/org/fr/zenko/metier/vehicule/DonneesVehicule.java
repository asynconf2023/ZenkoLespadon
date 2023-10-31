package org.fr.zenko.metier.vehicule;

import org.fr.zenko.metier.vehicule.Kilometrage.Kilometrage;
import org.fr.zenko.metier.vehicule.TypeVehicule.TypeVehicule;
import org.fr.zenko.metier.vehicule.annee.Annee;
import org.fr.zenko.metier.vehicule.energie.Energie;

public class DonneesVehicule {
    TypeVehicule typeVehicule;
    Energie energie;
    Kilometrage kilometrage;
    Annee annee;

    public DonneesVehicule(TypeVehicule typeVehicule, Energie energie, Kilometrage kilometrage, Annee annee) {
        this.typeVehicule = typeVehicule;
        this.energie = energie;
        this.kilometrage = kilometrage;
        this.annee = annee;
    }

    public double getScore(){
        double score = 0;
        score = score + this.typeVehicule.getNoteEco();
        score = score + this.energie.getNoteEco();
        score = score + this.kilometrage.getNoteEco();
        score = score + this.annee.getNoteEco();
        return score;
    }


}
