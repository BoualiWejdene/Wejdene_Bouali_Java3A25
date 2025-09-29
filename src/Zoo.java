public class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int NBRCAGES = 1;
    int animalCount;

    public Zoo() {
        animals = new Animal[NBRCAGES];
        animalCount = 0;

    }

    public Zoo(String name,String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBRCAGES];
        animalCount = 0;

    }

    public void displayZoo(){
        System.out.println("Zoo name: " + this.name + "\n" + "ville: " + this.city + "\n"
                + "nbr cages: " + NBRCAGES);
    }

    @Override
    public String toString() {
        return "zoo: name: " + name + ", city: " + city + ", nbr cages: " + NBRCAGES;
    }

    public boolean addAnimal(Animal animal){
        if(animalCount >= NBRCAGES){
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

    public boolean removeAnimal(Animal animal){
        for (int i = 0; i < animalCount; i++) {
            if(animals[i].equals(animal)){
                for (int j = i; j <animalCount -1  ; j++) {
                    animals[j] = animals[j+1];

                }
                animals[animalCount-1] = null;
                animalCount--;
                System.out.println("animal supprimé du zoo");
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull(){
        if(animalCount >= NBRCAGES){
            System.out.println("Zoo full");
            return true;
        }else{
            System.out.println("zoo not full ");
            return false;
        }
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.animalCount >= z2.animalCount){
            return z1;
        }else{
            return z2;
        }
    }
}
