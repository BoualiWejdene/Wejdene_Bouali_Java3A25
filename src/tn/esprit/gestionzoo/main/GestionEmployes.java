package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Employe;
import tn.esprit.gestionzoo.entities.SocieteArrayList;

public class GestionEmployes {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
        Employe e1 = new Employe(3, "Sofie", "IT", "Dupont", 1);
        Employe e2 = new Employe(1, "Eya", "Finance", "eya", 3);
        Employe e3 = new Employe(2, "Mariem", "IT", "mariem", 5);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        societe.displayEmploye();

        System.out.println("Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("Tri par département et grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println(societe.rechercherEmploye("Dupont"));
        System.out.println(societe.rechercherEmploye(e1));

        System.out.println("Suppression :");
        societe.supprimerEmploye(e1);
        societe.displayEmploye();

        System.out.println("Recherche par département :");
        System.out.println(societe.rechercherParDepartement("IT"));
    }
}
