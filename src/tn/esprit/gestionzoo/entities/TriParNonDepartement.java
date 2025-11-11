package tn.esprit.gestionzoo.entities;

import java.util.Comparator;

public class TriParNonDepartement implements Comparator<Employe> {

    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.getNomDepartement().compareTo(o2.getNomDepartement());
    }
}
