package tn.esprit.gestionzoo.entities;

import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
        int result = o1.getNomDepartement().compareTo(o2.getNomDepartement());
        if (result != 0) return result;

        result = Integer.compare(o1.getGrade(), o2.getGrade());
        return result;
    }

}
