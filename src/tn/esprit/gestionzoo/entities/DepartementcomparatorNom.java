package tn.esprit.gestionzoo.entities;

import java.util.Comparator;

public class DepartementcomparatorNom implements Comparator<Departement> {
    @Override
    public int compare(Departement o1, Departement o2) {
        return o1.getNomDepartement().compareTo(o2.getNomDepartement());
    }

}
