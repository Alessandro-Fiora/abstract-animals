package org.lessons.java.animals;

import org.lessons.java.animals.interfaces.Flying;

public class Passerotto extends AbstractAnimale implements Flying {

    public Passerotto(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void verso() {
        System.out.println("Cip cip");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando semi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }

}
