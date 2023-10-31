package org.fr.zenko.metier.banque;

public class DonneesBancaires {
    double scoreVehicule;
    int nbPassagers;

    public DonneesBancaires(double scoreVehicule, int nbPassagers){
        this.scoreVehicule = scoreVehicule;
        this.nbPassagers = nbPassagers;
    }

    public int getNbPassagers(){
        return this.nbPassagers;
    }

}
