package org.lessons.java.animals;

public class Delfino extends AbstractAnimale {

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

}
