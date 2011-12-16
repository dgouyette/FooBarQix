package com.cestpasdur;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FooBarQixWriter {

    private static final Logger LOGGER = LoggerFactory.getLogger(FooBarQixWriter.class);

    public static boolean estDivisible(int valeur, int divisiblePar) {
        return valeur % divisiblePar == 0;
    }

    public static String contient(int valeur) {
        String[] valeurs = String.valueOf(valeur).split("");
        StringBuilder retour = new StringBuilder();

        for (String s : valeurs) {
            for (FooBarQix f  : FooBarQix.values()){
                 if (s.equals(f.getStringValue())){
                     retour.append(f);
                 }
            }
        }
        return retour.toString();
    }

    public static String valueOf(int valeur) {
        StringBuilder retour = new StringBuilder();
        for (FooBarQix f  : FooBarQix.values()){
            if (estDivisible(valeur, f.getValue())){
                retour.append(f);
            }
        }
        retour.append(contient(valeur));

        if (retour.toString().equals("")){
            return String.valueOf(valeur);
        }
        return retour.toString();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            LOGGER.debug("{}", valueOf(i));
        }
        LOGGER.debug("duree : {} ms", System.currentTimeMillis()-start);
    }
}
