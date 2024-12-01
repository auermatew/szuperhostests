package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos instanceof Bosszuallo) {
            Bosszuallo other = (Bosszuallo) szuperhos;
            return other.isVanEGyengesege() && this.szuperero > other.szuperero;
        }
        if (szuperhos instanceof Batman) {
            Batman batman = (Batman) szuperhos;
            return this.szuperero >= 2 * batman.mekkoraAzEreje();
        }
        return false;
    }



    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }

    @Override
    public String toString() {
        String gyengesege = vanEGyengesege ? "van gyengesége" : "nincs gyengesége";
        return MessageFormat.format("Szupererő: {0}; {1}", szuperero, gyengesege);
    }
}
