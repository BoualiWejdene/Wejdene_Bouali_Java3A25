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
        if(animalCount < animals.length){
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }else{
            return false;
        }
    }

}
