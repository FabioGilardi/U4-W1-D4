package esercizio3;

import interfaces.CheckIn;

public class Volontari implements CheckIn {

    //    ATTRIBUTES
    protected String nome;
    protected int age;
    protected boolean CV;

    //    CONSTRUCTORS
    public Volontari(String nome, int age, boolean CV) {
        this.nome = nome;
        this.age = age;
        this.CV = CV;
    }

    //    METHODS
    @Override
    public String checkIn() {
        return "Prestazione libera dalle 8 alle 18";
    }
}
