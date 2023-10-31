package org.fr.zenko.metier.vehicule.Kilometrage;

public class Kilometrage {
    Kilometre kilometre;
    double noteEco;

    public Kilometrage(Kilometre kilometre, double noteEco) {
        this.kilometre = kilometre;
        this.noteEco = noteEco;
    }

    public double getNoteEco() {
        return noteEco;
    }

    public Kilometre getKilometre() {
        return this.kilometre;
    }
}
