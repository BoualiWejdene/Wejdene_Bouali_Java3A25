package tn.esprit.gestionzoo.entities;

import java.util.Comparator;

public class DepartementComparatorNombreEmployes implements Comparator<Departement> {
    @Override
    public int compare(Departement o1, Departement o2) {
        return o1.getNombreEmployes()- o2.getNombreEmployes();
    }
}
