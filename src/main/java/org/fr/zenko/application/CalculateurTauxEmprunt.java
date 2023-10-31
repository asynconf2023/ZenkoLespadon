package org.fr.zenko.application;

import org.fr.zenko.metier.banque.DonneesBancaires;
import org.fr.zenko.metier.banque.InfosTaux;
import org.fr.zenko.metier.vehicule.DonneesVehicule;

import java.util.ArrayList;

public class CalculateurTauxEmprunt {


    DonneesVehicule donneesVehicule;
    DonneesBancaires donneesBancaires;

    private ArrayList<Double[]> tauxEmprunts;
    private Double[] bonusNbPassagers;

    public CalculateurTauxEmprunt(DonneesVehicule donneesVehicule, DonneesBancaires donneesBancaires) {

        this.donneesVehicule = donneesVehicule;
        this.donneesBancaires = donneesBancaires;
        this.tauxEmprunts = InfosTaux.getTauxEmprunts();
        this.bonusNbPassagers = InfosTaux.getBonusNbPassagers();


    }

    public double calculerTauxEmprunt(double score, int nbPassagers) {
        double tauxEmprunt = -1.0;

        for (int i = 0; i < tauxEmprunts.size(); i++) {

            //parcourt tous les taux pour donner à tauxEmprunt le bon taux
            if (score >= tauxEmprunts.get(i)[0] && score <= tauxEmprunts.get(i)[1]) {
                System.out.println(i);
                tauxEmprunt = tauxEmprunts.get(i)[2];
            }
        }
        tauxEmprunt = tauxEmprunt + calculerBonusNbPassagers(nbPassagers);
        return tauxEmprunt;
    }

    public double calculerBonusNbPassagers(int nbPassagers){
        return bonusNbPassagers[nbPassagers - 1];
    }
}