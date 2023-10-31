package org.fr.zenko.metier.vehicule.energie;

public class Energie {
    String nom;
    double noteEco;

    public Energie(String nom, double noteEco){
        this.nom = nom;
        this.noteEco = noteEco;
    }

    public double getNoteEco() {
        return noteEco;
    }

    public String getNom() {
        return this.nom;
    }
}
