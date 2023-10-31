package org.fr.zenko.metier.banque;

import java.util.ArrayList;

public class InfosTaux {
    private static final ArrayList<Double[]> tauxEmprunts;
    private static final Double[] bonusNbPassagers;

    static {
        tauxEmprunts = new ArrayList<>();
        tauxEmprunts.add(new Double[]{0.0, 10.0, 3.00});
        tauxEmprunts.add(new Double[]{11.0, 15.0, 2.74});
        tauxEmprunts.add(new Double[]{16.0, 25.0, 2.52});
        tauxEmprunts.add(new Double[]{26.0, 33.0, 2.10});
        tauxEmprunts.add(new Double[]{34.0, 40.0, 1.85});

        bonusNbPassagers = new Double[]{0.11, -0.17, -0.29, -0.53};
    }

    private InfosTaux(){}

    public static ArrayList<Double[]> getTauxEmprunts(){
        return tauxEmprunts;
    }

    public static Double[] getBonusNbPassagers(){
        return bonusNbPassagers;
    }
}
