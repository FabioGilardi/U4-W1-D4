package esercizio2;

import enums.Department;
import esercizio1.Dipendente;

public class DipendenteFullTime extends Dipendente {

    //    CONSTRUCTORS

    public DipendenteFullTime(Department dipartimento) {
        super(dipartimento);
    }


//    METHODS

    @Override
    public int calcuteSalary() {
        return 1600;
    }
}
