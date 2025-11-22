package tn.esprit.gestionzoo.entities;

import java.util.HashMap;
import java.util.Map;

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



}
