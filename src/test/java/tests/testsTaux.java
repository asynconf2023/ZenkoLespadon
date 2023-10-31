package tests;

import org.fr.zenko.application.CalculateurTauxEmprunt;
import org.fr.zenko.metier.banque.DonneesBancaires;
import org.fr.zenko.metier.vehicule.DonneesVehicule;
import org.fr.zenko.metier.vehicule.Kilometrage.Kilometrage;
import org.fr.zenko.metier.vehicule.Kilometrage.Kilometre;
import org.fr.zenko.metier.vehicule.TypeVehicule.Poids;
import org.fr.zenko.metier.vehicule.TypeVehicule.TypeVehicule;
import org.fr.zenko.metier.vehicule.annee.Annee;
import org.fr.zenko.metier.vehicule.energie.Energie;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testsTaux {

    @Test
    public void testCalculTauxEmpruntExemple1() {
        TypeVehicule citadine = new TypeVehicule("Citadine", new Poids(800, 1300), 8);
        Energie electrique = new Energie("Electrique", 9);
        Kilometrage kilometrage = new Kilometrage(new Kilometre(25000, 29999), 1);
        Annee annee = new Annee(2000, 2009, 5);

        DonneesVehicule donneesVehicule = new DonneesVehicule(citadine, electrique, kilometrage, annee);
        DonneesBancaires donneesBancaires = new DonneesBancaires(donneesVehicule.getScore(), 1);

        CalculateurTauxEmprunt calculateur = new CalculateurTauxEmprunt(donneesVehicule, donneesBancaires);

        double tauxEmprunt = calculateur.calculerTauxEmprunt(donneesVehicule.getScore(), donneesBancaires.getNbPassagers());

        assertEquals(2.63, tauxEmprunt, 0.01);
    }

    @Test
    public void testCalculTauxEmpruntExemple2() {
        TypeVehicule citadine = new TypeVehicule("Citadine", new Poids(800, 1300), 8);
        Energie hybride = new Energie("Hybride", 7);
        Kilometrage kilometrage = new Kilometrage(new Kilometre(5000, 9999), 9);
        Annee annee = new Annee(2010, 2023, 8);

        DonneesVehicule donneesVehicule = new DonneesVehicule(citadine, hybride, kilometrage, annee);
        DonneesBancaires donneesBancaires = new DonneesBancaires(donneesVehicule.getScore(), 4);

        CalculateurTauxEmprunt calculateur = new CalculateurTauxEmprunt(donneesVehicule, donneesBancaires);

        double tauxEmprunt = calculateur.calculerTauxEmprunt(donneesVehicule.getScore(), donneesBancaires.getNbPassagers());

        assertEquals(1.57, tauxEmprunt, 0.01);
    }

    @Test
    public void testCalculTauxEmpruntExemple3() {
        TypeVehicule cabriolet = new TypeVehicule("Cabriolet", new Poids(1300, 2000), 6);
        Energie diesel = new Energie("Diesel", 4);
        Kilometrage kilometrage = new Kilometrage(new Kilometre(10000, 14999), 7);
        Annee annee = new Annee(1990, 1999, 4);

        DonneesVehicule donneesVehicule = new DonneesVehicule(cabriolet, diesel, kilometrage, annee);
        DonneesBancaires donneesBancaires = new DonneesBancaires(donneesVehicule.getScore(), 2);

        CalculateurTauxEmprunt calculateur = new CalculateurTauxEmprunt(donneesVehicule, donneesBancaires);

        double tauxEmprunt = calculateur.calculerTauxEmprunt(donneesVehicule.getScore(), donneesBancaires.getNbPassagers());

        assertEquals(2.35, tauxEmprunt, 0.01);
    }
}