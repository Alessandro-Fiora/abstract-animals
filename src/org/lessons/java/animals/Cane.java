package org.lessons.java.animals;

public class Cane extends AbstractAnimale {

    public Cane(String nome, int eta) {
        super(nome, eta);
    }

    @Override
    public void verso() {
        System.out.println("Bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando crocchette");
    }


}
