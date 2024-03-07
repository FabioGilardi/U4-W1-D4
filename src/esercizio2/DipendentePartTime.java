package esercizio2;

import enums.Department;
import esercizio1.Dipendente;

public class DipendentePartTime extends Dipendente {

    //    ATTRIBUTES
    protected int oreMensili;

    //CONSTRUCTORS


    public DipendentePartTime(Department dipartimento, int oreMensili) {
        super(dipartimento);
        this.oreMensili = oreMensili;
    }

    //    METHODS
    @Override
    public int calcuteSalary() {
        return 7 * this.oreMensili;
    }

    @Override
    public String checkIn() {
        return "Turno Mattina 8.00-12.00, Turno Pomeriggio 13.00-17.00";
    }
}
