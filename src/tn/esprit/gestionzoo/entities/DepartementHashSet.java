package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.IDepartement;

import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
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
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        System.out.println(departements);
    }

    @Override
    public void trierDepartementsParId() {
        Set<Departement> myset = new TreeSet<>();
        myset.addAll(departements);
        for (Departement d : myset) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        Set<Departement> s = new TreeSet<>(new DepartementcomparatorNom()
                .thenComparing(new DepartementComparatorNombreEmployes()));

        s.addAll(departements);
        for (Departement d : s) {
            System.out.println(d);
        }
    }
}
