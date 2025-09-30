public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int comptAnimaux;

    public Zoo() {
        animals = new Animal[25];

    }

    public Zoo(String name,String city,int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
        this.nbrCages = nbrCages;

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
        if(comptAnimaux < animals.length){
            animals[comptAnimaux] = animal;
            comptAnimaux++;
            return true;
        }else {
            return false;
        }
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




}
