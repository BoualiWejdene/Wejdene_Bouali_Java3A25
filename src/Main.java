public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("pretador","simba",4,true);
        Zoo myZoo= new Zoo("Zoo de tunis","tunis",20);

        Animal elephant = new Animal("Dumbo", "éléphant", 10,true);
        Animal girafe  = new Animal("Herbivore", "Girafe", 10, true);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(elephant));
        System.out.println(myZoo.addAnimal(girafe));
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(lion));


    }
}
