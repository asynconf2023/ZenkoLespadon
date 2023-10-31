package org.fr.zenko.metier.vehicule.energie;

import java.util.ArrayList;
import java.util.List;

public class Energies {
    public static List<Energie> energies = new ArrayList<>();

    static {
        energies.add(new Energie("Essence", 5));
        energies.add(new Energie("Electrique", 9));
        energies.add(new Energie("Gaz", 6));
        energies.add(new Energie("Diesel", 4));
        energies.add(new Energie("Hybride", 7));
    }

    public static List<Energie> get(){
        return energies;
    }
}
