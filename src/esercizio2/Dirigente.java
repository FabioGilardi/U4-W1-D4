package esercizio2;

import enums.Department;
import esercizio1.Dipendente;

public class Dirigente extends Dipendente {

    //    CONSTRUCTORS
    public Dirigente(Department dipartimento) {
        super(dipartimento);
    }

    //    METHODS
    @Override
    public int calcuteSalary() {
        return 4000;
    }
}
