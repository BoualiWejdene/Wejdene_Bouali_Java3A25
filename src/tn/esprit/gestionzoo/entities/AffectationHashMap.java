package tn.esprit.gestionzoo.entities;

import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d){
        affectations.put(e, d);
    }

    public void afficherEmployesEtDepartements(){
        System.out.println(affectations);
    }

    //sarra
    public void supprimerEmploye(Employe e){
        affectations.remove(e);
    }

    // Sarra Dev
    public void supprimerEmployeEtDepartement(Employe e, Departement d){
            affectations.remove(e,d);

    }

    public void afficherEmployes(){
        System.out.println(affectations.keySet());

    }

    public void afficherDepartements() {
        System.out.println(affectations.values());

    }

    public boolean rechercherEmploye(Employe e){
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d){
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap(affectations);
//        Map<Employe, Departement> map = new TreeMap(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//
//            }
//        });
    }

}
