package tn.esprit.gestionzoo.entities;

import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d){
        affectations.putIfAbsent(e, d);
    }

    public void afficherEmployesEtDepartements(){
        System.out.println(affectations);
    }

    public void supprimerEmploye(Employe e){
        affectations.remove(e);
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d){
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    public void afficherEmployes(){
        Set<Employe> myset = affectations.keySet();
        Iterator<Employe> it = myset.iterator();
        while (it.hasNext()) {
            System.out.println(it .next());

        }
    }

    public void afficherDepartements() {
        Collection<Departement> departements = affectations.values();
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employe e){
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d){
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> mymap = new TreeMap(affectations);
        return mymap;
    }





}
