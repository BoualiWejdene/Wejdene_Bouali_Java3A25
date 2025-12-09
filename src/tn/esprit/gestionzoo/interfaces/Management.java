package tn.esprit.gestionzoo.interfaces;

import tn.esprit.gestionzoo.entities.Produit;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface Management {
        void displayProducts(List<Produit> products, Consumer<Produit> con);
        void displayProductsByFilter(List<Produit> products, Predicate<Produit> pre, Consumer<Produit>con);
        String returnProductsNames(List<Produit> products, Function<Produit, String> fun);
        Produit createProduct(Supplier<Produit> sup);
        List<Produit> sortProductsById(List<Produit> products, Comparator<Produit> com);
        Stream<Produit> convertToStream(List<Produit> products);

    }
