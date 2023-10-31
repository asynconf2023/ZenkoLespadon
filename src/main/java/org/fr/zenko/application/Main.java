/*
package org.fr.zenko.application;

import org.fr.zenko.metier.vehicule.Kilometrage.Kilometrage;
import org.fr.zenko.metier.vehicule.TypeVehicule.TypeVehicule;
import org.fr.zenko.metier.vehicule.TypeVehicule.TypesVehicule;
import org.fr.zenko.metier.vehicule.annee.Annee;
import org.fr.zenko.metier.vehicule.energie.Energie;

import java.time.chrono.JapaneseEra;
import java.util.Scanner;

import static org.fr.zenko.metier.vehicule.energie.Energies.energies;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Entrez le type de votre véhicule");
            String typeVehicule = scanner.nextLine();

            System.out.println("Entrez le type d'énergie que consomme votre véhicule");
            String energie = scanner.nextLine();

            System.out.println("Entrez le nombre de kilomètre que vous pensez faire en moyenne chaque année");
            String kilometrage = scanner.nextLine();

            System.out.println("Entrez l'année de mise en service de votre véhicule");
            String annee = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        } finally {
                scanner.close();
        }

        Vehicule vehicule = convertirVehicule(typeVehicule, energie, kilometrage, annee);
    }

    public static Vehicule convertirVehicule(TypeVehicule typeVehicule, Energie energie, Kilometrage kilometrage, Annee annee){
        TypeVehicule typeDuVehicule;
        for (TypeVehicule type : TypesVehicule.get()) {
            if (type.nom.equals(TypeVehicule.nom)){
                typeDuVehicule = type;
            }
        }
        for (Energie energiei : Energies.get()) {
            if (type.nom.equals(TypeVehicule.nom)){
                typeDuVehicule = type;
            }
        }
        return vehicule;
    }
}
*/

