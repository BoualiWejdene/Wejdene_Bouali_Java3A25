public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("pretador","simba",4,true);
        Animal elephant = new Animal("Dumbo", "éléphant", 10,true);
        Animal girafe  = new Animal("Herbivore", "Girafe", 10, true);

        Zoo myZoo= new Zoo("Zoo de tunis","tunis");
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


    }
}
