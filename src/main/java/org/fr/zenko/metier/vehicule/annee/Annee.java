package org.fr.zenko.metier.vehicule.annee;

public class Annee {
    int minimum;
    int maximum;
    double noteEco;

    public Annee(int minimum, int maximum, double noteEco){
        this.minimum = minimum;
        this.maximum = maximum;
        this.noteEco = noteEco;
    }

    public double getNoteEco() {
        return noteEco;
    }

    public int getMinimum() {
        return this.minimum;
    }

    public int getMaximum() {
        return this.maximum;
    }
}
