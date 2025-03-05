package org.lessons.java.animals;

import org.lessons.java.animals.interfaces.Flying;

public class Aquila extends AbstractAnimale implements Flying {

    public Aquila(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void verso() {
        System.out.println("Screech");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando topi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }

}
