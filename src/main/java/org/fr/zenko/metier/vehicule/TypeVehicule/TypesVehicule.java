package org.fr.zenko.metier.vehicule.TypeVehicule;
import java.util.ArrayList;
import java.util.List;

public class TypesVehicule {

    private static List<TypeVehicule> typesVoiture = new ArrayList<>();

    static {
        typesVoiture.add(new TypeVehicule("Berline", new Poids(1300, 1800), 6.5));
        typesVoiture.add(new TypeVehicule("Cabriolet", new Poids(1300, 2000), 6));
        typesVoiture.add(new TypeVehicule("Citadine", new Poids(800, 1300), 8));
        typesVoiture.add(new TypeVehicule("SUV / 4x4", new Poids(1500, 2500), 4));
    }

    public static List<TypeVehicule> get() {
        return typesVoiture;
    }
}