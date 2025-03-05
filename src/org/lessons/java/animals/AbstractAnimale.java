package org.lessons.java.animals;

public abstract class AbstractAnimale {

    private String nome;
    private int eta;

    public AbstractAnimale(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }

    public void dormi(){
        System.out.println("Zzzz");
    }

    // * Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && nome.length() > 0){
            this.nome = nome;
        } else {
            System.out.println("Nome non valido");
        }
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        if(eta > 0){
            this.eta = eta;
        } else {
            System.out.println("Eta non valida");
        }
    }

    // * Medoti astratti
    public abstract void verso();
    public abstract void mangia();


}
