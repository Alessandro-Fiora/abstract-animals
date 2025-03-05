package org.lessons.java.animals;

import org.lessons.java.animals.interfaces.Swimming;

public class Delfino extends AbstractAnimale implements Swimming {

    public Delfino(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void verso() {
        System.out.println("Fischio");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando pesci");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!");
    }

}
