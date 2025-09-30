public class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int NBR_CAGES = 25;
    int comptAnimaux;

    public Zoo() {
        animals = new Animal[25];

    }

    public Zoo(String name,String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];


    }

    public void displayZoo(){
        System.out.println("Zoo name: " + this.name + "\n" + "ville: " + this.city + "\n"
                + "nbr cages: " + NBR_CAGES);
    }

    @Override
    public String toString() {
        return "zoo: name: " + name + ", city: " + city + ", nbr cages: " + NBR_CAGES;
    }

    public boolean addAnimal(Animal animal){
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal déja existe dans le zoo");
            return false;
        }

        if (comptAnimaux >= NBR_CAGES) {
            System.out.println("Le zoo est plein");
            return false;
        }
        animals[comptAnimaux] = animal;
        comptAnimaux++;
        return true;
    }

    public void displayAnimals(){
        for(int i = 0; i < comptAnimaux; i++){
            System.out.println(animals[i]);
        }
    }


    public int searchAnimal(Animal animal){
        for(int i = 0; i < comptAnimaux; i++){
            if(animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if(index == -1){
            return false;
        }

        for(int i = index; i < comptAnimaux- 1 ;i++){
            animals[i] = animals[i+1];
        }
        animals[comptAnimaux-1] = null;
        comptAnimaux--;
        return true;
    }

    public boolean isZooFull(){
        return comptAnimaux >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.comptAnimaux > z2.comptAnimaux)
            return z1;

        return z2;
    }


}
