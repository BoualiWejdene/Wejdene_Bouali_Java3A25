package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.interfaces.Management;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ProductManagement implements Management {
    @Override
    public void displayProducts(List<Produit> products, Consumer<Produit> con) {
        products.forEach(con);
    }

    @Override
    public void displayProductsByFilter(List<Produit> products, Predicate<Produit> pre, Consumer<Produit> con) {
        for (Produit p : products){
            if(pre.test(p)){
                con.accept(p);
            }
        }
    }

    @Override
    public String returnProductsNames(List<Produit> products, Function<Produit, String> fun) {
            String names = "";
            for(Produit p: products){
                names+=fun.apply(p);
            }
            return names;
    }

    @Override
    public Produit createProduct(Supplier<Produit> sup) {
        return sup.get();
    }

    @Override
    public List<Produit> sortProductsById(List<Produit> products, Comparator<Produit> com) {
        Collections.sort(products, com);
        return products;
    }

    @Override
    public Stream<Produit> convertToStream(List<Produit> products) {
        return products.stream();
    }
}
