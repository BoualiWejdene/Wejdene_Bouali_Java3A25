public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("pretador","simba",4,true);
        Zoo myZoo= new Zoo("Zoo de tunis","tunis");
        Zoo zoo2 = new Zoo("Zoo de sousse", "Sousse");

        Animal elephant = new Animal("Dumbo", "éléphant", 10,true);
        Animal girafe  = new Animal("Herbivore", "Girafe", 10, true);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(elephant));
        System.out.println(myZoo.addAnimal(lion));


        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion));
        Animal lion2 = new Animal("pretador","simba",4,true);
        System.out.println(myZoo.addAnimal(lion2));
        System.out.println(myZoo.searchAnimal(lion2));

        System.out.println(myZoo.removeAnimal(lion));
        System.out.println(myZoo.addAnimal(girafe));
        myZoo.isZooFull();

        System.out.println(zoo2.addAnimal(girafe));

        System.out.println("Zoo avec le plus d'animaux: " + myZoo.comparerZoo(myZoo,zoo2));

    }
}
