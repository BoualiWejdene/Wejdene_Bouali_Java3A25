public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount;

    public Zoo() {
        animals = new Animal[25];
        animalCount = 0;

    }

    public Zoo(String name,String city,int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
        this.nbrCages = nbrCages;
        animalCount = 0;

    }

    public void displayZoo(){
        System.out.println("Zoo name: " + this.name + "\n" + "ville: " + this.city + "\n"
                + "nbr cages: " + this.nbrCages);
    }

    @Override
    public String toString() {
        return "zoo: name: " + name + ", city: " + city + ", nbr cages: " + nbrCages;
    }

    public boolean addAnimal(Animal animal){
        if(animalCount >= nbrCages){
            System.out.println("Zoo over");
            return false;
        }

        for(int i = 0; i < animalCount; i++){
            if(animals[i].name.equals(animal.name)){
                System.out.println("cet animal existe déjà");
                return false;
            }
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println("animal ajouté au zoo");
        return true;
    }

    public void displayAnimals(){
        for(int i = 0; i < animalCount; i++){
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal){
        for(int i = 0; i < animalCount; i++){
            if(animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
    }

}
