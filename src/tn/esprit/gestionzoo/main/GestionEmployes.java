package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class GestionEmployes {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();
//        Employe e1 = new Employe(3, "Sofie", "IT", "Dupont", 1);
//        Employe e2 = new Employe(1, "Eya", "Finance", "eya", 3);
//        Employe e3 = new Employe(2, "Mariem", "IT", "mariem", 5);
//
//        societe.ajouterEmploye(e1);
//        societe.ajouterEmploye(e2);
//        societe.ajouterEmploye(e3);

        societe.displayEmploye();

        System.out.println("Tri par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("Tri par département et grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
//
//        System.out.println(societe.rechercherEmploye("Dupont"));
//        System.out.println(societe.rechercherEmploye(e1));
//
//        System.out.println("Suppression :");
//        societe.supprimerEmploye(e1);
//        societe.displayEmploye();

        System.out.println("Recherche par département :");
        System.out.println(societe.rechercherParDepartement("IT"));


        //Prosit 9
        System.out.println("Prosit 9  :");
        DepartementHashSet gestion = new DepartementHashSet();
//        Departement d1 = new Departement(3, "Informatique", 10);
//        Departement d2 = new Departement(1, "Ressources Humaines", 5);
//        Departement d3 = new Departement(2, "Finance", 7);
//        Departement d4 = new Departement(4, "Informatique", 15);

//        gestion.ajouterDepartement(d1);
//        gestion.ajouterDepartement(d2);
//        gestion.ajouterDepartement(d3);
//        gestion.ajouterDepartement(d4);

        System.out.println("les départements : ");
        gestion.afficherDepartements();

        System.out.println("Recherche 'Finance' : " + gestion.rechercherDepartement("Finance"));
        System.out.println("Recherche 'Marketing' : " + gestion.rechercherDepartement("Marketing"));

//        System.out.println("Recherche d1 : " + gestion.rechercherDepartement(d1));
//        System.out.println("Recherche d5 : " + gestion.rechercherDepartement(new Departement(5, "Marketing", 12)));
//
//        System.out.println("Suppression d3");
//        gestion.supprimerDepartement(d3);
//        gestion.afficherDepartements();

//        System.out.println("Tri par ID :");
//        gestion.trierDepartementsParId();
//
//        System.out.println("Tri par Nom puis Nombre Employés :");
//        gestion.trierDepartementsParNomEtNombreEmployes();


        System.out.println("Prosit 10 :");
        AffectationHashMap myMap = new AffectationHashMap();

        Employe e1 = new Employe(3, "Sofie", "Informatique", "Dupont", 1);
        Employe e2 = new Employe(1, "Eya", "Finance", "eya", 3);

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "Finance", 7);

        myMap.ajouterEmployeDepartement(e1, d1);
        myMap.ajouterEmployeDepartement(e2, d2);

        myMap.afficherEmployesEtDepartements();

        myMap.ajouterEmployeDepartement(e1, d2);
        myMap.afficherEmployesEtDepartements();

        myMap.supprimerEmploye(e1);
        myMap.afficherEmployesEtDepartements();

        myMap.supprimerEmployeEtDepartement(e2, d2);
        myMap.afficherEmployesEtDepartements();


        myMap.ajouterEmployeDepartement(e1, d1);
        myMap.ajouterEmployeDepartement(e2, d2);

        myMap.afficherEmployes();

    }
}
