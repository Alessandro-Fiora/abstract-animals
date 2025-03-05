package org.lessons.java.animals;

public class Main {
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
    }
}
