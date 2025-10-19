package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("pretador","simba",4,true);
        Animal elephant = new Animal("Dumbo", "éléphant", 10,true);
        Animal girafe  = new Animal("Herbivore", "Girafe", 10, true);

        Zoo myZoo= new Zoo("Zoo de tunis","tunis");
        Zoo myZoo2= new Zoo("Zoo de Sousse","sousse");
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);

        //Instruction 10
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(girafe));
        System.out.println(myZoo.addAnimal(elephant));

        //Instruction 11
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(girafe));
        Animal girafe2  = new Animal("Herbivore", "Girafe", 10, true);
        System.out.println(myZoo.searchAnimal(girafe2));

        //Instruction 12
        System.out.println(myZoo.addAnimal(elephant));

        //Instruction 13
        System.out.println(myZoo.removeAnimal(lion));
        myZoo.displayAnimals();

        //Instruction 15
        System.out.println(myZoo.isZooFull());

        //Instruction 16
        System.out.println(Zoo.comparerZoo(myZoo,myZoo2));

        //Instruction 21
        System.out.println("Instruction 21");
        Aquatic animalAquatic = new Aquatic();
        Terrestrial animalTerrestrial = new Terrestrial();
        Dolphin d = new Dolphin();
        Penguin p = new Penguin();

        Dolphin d1 = new Dolphin("dolphin", "d1", 5, true, "habitat", 25.5f);
        Penguin p1 = new Penguin("Penguin", "p2", 3, false, "habitat", 4.2f);


        Terrestrial t1 = new Terrestrial("f1", "Chien", 2, true, 4);
        System.out.println(d1);
        System.out.println(p1);
        System.out.println(t1);

        //Instruction 24
        Aquatic a1 = new Aquatic("Poisson", "p1", 2, false, "habitat");
        a1.swim();
        d1.swim();
        p1.swim();

        //Instruction 25
        Zoo myZoo3 = new Zoo("Zoo3 ", "Tunis");
        System.out.println("Le zoo a été créé");

        //Instruction 26
        Aquatic poisson = new Aquatic("Poisson", "Nemo", 2, false, "Océan");
        Dolphin dauphin = new Dolphin("family2", "d1", 6, true, "Océan", 22.4f);
        Penguin pingouin = new Penguin("family3", "p1", 3, false, "Océan", 30.2f);

        myZoo3.addAquaticAnimal(poisson);
        myZoo3.addAquaticAnimal(dauphin);
        myZoo3.addAquaticAnimal(pingouin);

    }
}
