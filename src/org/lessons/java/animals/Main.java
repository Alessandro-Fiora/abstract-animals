package org.lessons.java.animals;

import org.lessons.java.animals.interfaces.Flying;
import org.lessons.java.animals.interfaces.Swimming;

public class Main {

    static void faiVolare(Flying animale) {
            animale.vola();
        }
    
    static void faiNuotare(Swimming animale) {
            animale.nuota();
        }
        
    public static void main(String[] args) {

        Cane Fido = new Cane("Fido", 5);
        System.out.println("Nome: " + Fido.getNome());
        System.out.println("Età: " + Fido.getEta());
        Fido.verso();
        Fido.mangia();
        Fido.dormi();

        Aquila AquilaReale = new Aquila("Aquila Reale", 10);
        System.out.println("Nome: " + AquilaReale.getNome());
        System.out.println("Età: " + AquilaReale.getEta());
        AquilaReale.verso();
        AquilaReale.mangia();
        AquilaReale.dormi();
        faiVolare(AquilaReale);

        Delfino Flipper = new Delfino("Flipper", 15);
        System.out.println("Nome: " + Flipper.getNome());
        System.out.println("Età: " + Flipper.getEta());
        Flipper.verso();
        Flipper.mangia();
        Flipper.dormi();
        faiNuotare(Flipper);

    }
}
