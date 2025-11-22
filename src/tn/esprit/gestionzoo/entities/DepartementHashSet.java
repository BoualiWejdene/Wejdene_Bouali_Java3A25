package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.IDepartement;

import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        // -1 ->0
//        Iterator<Departement> it = departements.iterator();
//        while (it.hasNext()) {
//            if (nomDepartement.equals(it.next().getNomDepartement()))
//                return true;
//        }
//        return false;
        for (Departement d : departements) {
            if (d.getNomDepartement().equals(nomDepartement))
                return true;
        }
        return false;
    }


    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        this.departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        System.out.println(this.departements);
    }

    @Override
    public void trierDepartementsParId() {
        System.out.println(new TreeSet<>(departements));
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        Set<Departement> s = new TreeSet<>(new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getNomDepartement().compareTo(o2.getNomDepartement());
            }
        }.thenComparing(new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return o1.getNombreEmployes() - o2.getNombreEmployes();
            }
        }));
    }
}
