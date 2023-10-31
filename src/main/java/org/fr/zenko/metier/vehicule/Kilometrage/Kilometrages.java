package org.fr.zenko.metier.vehicule.Kilometrage;

import java.util.ArrayList;
import java.util.List;

public class Kilometrages {
    public static List<Kilometrage> kilometrages = new ArrayList<>();

    static {
        kilometrages.add(new Kilometrage(new Kilometre(5000, 9999), 9));
        kilometrages.add(new Kilometrage(new Kilometre(10000, 14999), 7));
        kilometrages.add(new Kilometrage(new Kilometre(15000, 19999), 5));
        kilometrages.add(new Kilometrage(new Kilometre(20000, 24999), 3));
        kilometrages.add(new Kilometrage(new Kilometre(25000, 29999), 1));
    }

    public static List<Kilometrage> get() {
        return kilometrages;
    }
}

