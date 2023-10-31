package org.fr.zenko.metier.vehicule.annee;

import java.util.ArrayList;
import java.util.List;
public class Annees {
    public static List<Annee> annees = new ArrayList<>();

    static {
        annees.add(new Annee(1960, 1969, 1));
        annees.add(new Annee(1970, 1979, 2));
        annees.add(new Annee(1980, 1989, 3));
        annees.add(new Annee(1990, 1999, 4));
        annees.add(new Annee(2000, 2009, 5));
        annees.add(new Annee(2010, 2023, 7));
    }

    public static List<Annee> get(){
        return annees;
    }
}
