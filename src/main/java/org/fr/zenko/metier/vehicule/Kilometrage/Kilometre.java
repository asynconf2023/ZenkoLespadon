package org.fr.zenko.metier.vehicule.Kilometrage;

public class Kilometre {
    double minimum;
    double maximum;

    public Kilometre(double minimum, double maximum){
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public double getMinimum(){
        return this.minimum;
    }

    public double getMaximum(){
        return this.maximum;
    }

}
