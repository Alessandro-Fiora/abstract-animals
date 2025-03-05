package org.lessons.java.animals;

public class Aquila extends AbstractAnimale {

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

}
