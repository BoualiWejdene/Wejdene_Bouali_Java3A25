package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    static final int NBR_CAGES = 25;
    private int comptAnimaux;

    public Zoo() {
        animals = new Animal[NBR_CAGES];

    }

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (! name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Le nom ne doit pas etre vide");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getComptAnimaux() {
        return comptAnimaux;
    }

    public void setComptAnimaux(int comptAnimaux) {
        this.comptAnimaux = comptAnimaux;
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
        if(isZooFull()) {
            System.out.println("Zoo is full");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Animal déja existe dans le zoo");
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
            if(animals[i].getName().equals(animal.getName())){
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
