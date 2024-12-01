package hu.petrik.szuperhosprojekt;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            String tipus = parts[0];
            int darab = Integer.parseInt(parts[1]);

            Szuperhos szuperhos;
            if (tipus.equalsIgnoreCase("Batman")) {
                szuperhos = new Batman();
            } else if (tipus.equalsIgnoreCase("Vasember")) {
                szuperhos = new Vasember();
            } else {
                continue;
            }

            for (int i = 0; i < darab; i++) {
                if (szuperhos instanceof Milliardos) {
                    ((Milliardos) szuperhos).kutyutKeszit();
                }
            }
            szuperhosLista.add(szuperhos);
        }
        reader.close();
    }

    public static void szuperhosok() {
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos);
        }
    }
}
