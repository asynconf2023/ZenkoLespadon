package org.fr.zenko.metier.vehicule.TypeVehicule;

public class TypeVehicule {
    public static String nom;
    private Poids poids;
    private double noteEco;

    public TypeVehicule(String nom, Poids poids, double noteEco) {
        this.nom = nom;
        this.poids = poids;
        this.noteEco = noteEco;
    }

    public double getNoteEco() {
        return noteEco;
    }

    public String getNom(){
        return this.nom;
    }
}

