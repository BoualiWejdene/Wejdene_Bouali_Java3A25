package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.ProductManagement;
import tn.esprit.gestionzoo.entities.Produit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class GestionPoduits {
    public static void main(String[] args) {
    List<Produit> produits = new ArrayList<>();
    produits.add(new Produit(1,"Machine",7500));
    produits.add(new Produit(1,"PC",500));
    produits.add(new Produit(1,"Iphone13",200));
    produits.add(new Produit(1,"Machine",2500));
    produits.add(new Produit(1,"PC",4500));
    produits.add(new Produit(1,"Iphone16",100));

    ProductManagement pm = new ProductManagement();
    produits.add(pm.createProduct( () -> new Produit(1,"Iphone13",200)));

    pm.displayProducts( produits ,product -> System.out.println(product));
    pm.displayProductsByFilter(produits, produit -> produit.getPrix() > 2232, product -> System.out.println(product)
        );
    pm.sortProductsById(produits, Comparator.comparingInt(Produit::getId));
    pm.convertToStream(produits);

    }
}
