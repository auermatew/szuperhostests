package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public class Batman implements Szuperhos, Milliardos {
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        return szuperhos.mekkoraAzEreje() < this.lelemenyesseg;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.lelemenyesseg * 2;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Batman: leleményesség: {0}", lelemenyesseg);
    }
}
