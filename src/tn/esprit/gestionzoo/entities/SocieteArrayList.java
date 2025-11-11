package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.IGestion;
import tn.esprit.gestionzoo.interfaces.IRechercheAvancee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private List<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (int i = 0; i < employes.size(); i++) {
            if(employes.get(i).getNom().equals(nom)){
                return true;
            }
        }
        return false;
//      for (Employe e : employes) {
//            if (e.getNom().equals(nom)) {
//                return true;
//            }
//        }
//        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employes);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes,
                new TriParNonDepartement()
                .thenComparing(new TriParGrade()));
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> l = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                l.add(e);
            }
        }
        return l;
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> l = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                l.add(e);
            }
        }
        return l;

    }
}
