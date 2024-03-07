package esercizio1;

import enums.Department;
import interfaces.CheckIn;

import java.util.Random;

public abstract class Dipendente implements CheckIn {

    //    ATTRIBUTES
    protected int matricola;
    protected int stipendio;
    protected Department dipartimento;

    //    CONSTRUCTORS
    public Dipendente(Department dipartimento) {
        this.matricola = matricolaRandom();
        this.stipendio = calcuteSalary();
        this.dipartimento = dipartimento;
    }

//    METHODS

    public static int matricolaRandom() {
        Random rndm = new Random();
        return rndm.nextInt(10000, 99999);
    }

    public int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public Department getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Department dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract int calcuteSalary();

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }

    @Override
    public String checkIn() {
        return "Mattina 9.00-13.00, Pomeriggio 14.00-18-00";
    }
}
