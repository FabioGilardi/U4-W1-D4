import enums.Department;
import esercizio1.Dipendente;
import esercizio2.DipendenteFullTime;
import esercizio2.DipendentePartTime;
import esercizio2.Dirigente;
import esercizio3.Volontari;
import interfaces.CheckIn;

public class Main {
    public static void main(String[] args) {

//        System.out.println("ESERCIZIO 1");
//        Dipendente dipendente1 = new Dipendente(1600, Department.AMMINISTRAZIONE);
//        Dipendente dipendente2 = new Dipendente(1400, Department.VENDITE);
//        Dipendente dipendente3 = new Dipendente(1800, Department.PRODUZIONE);
//        Dipendente[] employeeArray = {dipendente1, dipendente2, dipendente3};
//        for (int i = 0; i < employeeArray.length; i++) {
//            System.out.println(employeeArray[i].getMatricola());
//        }

        System.out.println("ESERCIZIO 2");
        DipendenteFullTime dipendenteFT = new DipendenteFullTime(Department.PRODUZIONE);
        DipendentePartTime dipendentePT = new DipendentePartTime(Department.VENDITE, 120);
        Dirigente dirigente = new Dirigente(Department.AMMINISTRAZIONE);
        Dipendente[] dipendenti = {dipendenteFT, dipendentePT, dirigente};
        System.out.println("Il dipendente Full Time prende: " + dipendenteFT.calcuteSalary() + "€");
        System.out.println("Il dipendente Part Time prende: " + dipendentePT.calcuteSalary() + "€");
        System.out.println("Il dirigente prende: " + dirigente.calcuteSalary() + "€");
        int total = 0;
        for (int i = 0; i < dipendenti.length; i++) {
            total += dipendenti[i].calcuteSalary();
        }
        System.out.println("Tutti e tre prendono: " + total + "€");

        System.out.println("ESERCIZIO 3");
        Volontari volontario1 = new Volontari("Bobby", 30, false);
        Volontari volontario2 = new Volontari("Ziggy", 24, true);
        CheckIn[] presenti = {dipendenteFT, dipendentePT, dirigente, volontario1, volontario2};
        for (int i = 0; i < presenti.length; i++) {
            System.out.println(presenti[i].checkIn());
        }

    }
}