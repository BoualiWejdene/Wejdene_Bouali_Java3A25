package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int NBR_CAGES = 3;
    private static final int MAX_AQUATICS = 10;

    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private int comptAnimaux;
    private int aquaticCount;

    public Zoo() {
        animals = new Animal[NBR_CAGES];
        aquaticAnimals = new Aquatic[MAX_AQUATICS];

    }

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[MAX_AQUATICS];
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

    public int getAquaticCount() {
        return aquaticCount;
    }

    public void setAquaticCount(int aquaticCount) {
        this.aquaticCount = aquaticCount;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public void displayZoo(){
        System.out.println("Zoo name: " + this.name + "\n" + "ville: " + this.city + "\n"
                + "nbr animaux: " + comptAnimaux  + "\n"
                + "nbr animaux aquatiques: " + aquaticCount);
    }

    @Override
    public String toString() {
        return "zoo: name: " + name + ", city: " + city + ", nbr cages: " + NBR_CAGES;
    }

    public void addAnimal(Animal animal) throws ZooFullException,InvalidAgeException {
        if (comptAnimaux >= NBR_CAGES) {
            throw new ZooFullException("Le zoo est plein, impossible d’ajouter un nouvel animal" );
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Animal déja existe dans le zoo");

        }

        if (animal.getAge() <= 0) {
            throw new InvalidAgeException("Âge d’animal invalide : l’âge ne peut pas être négatif.");
        }

        animals[comptAnimaux] = animal;
        comptAnimaux++;
        System.out.println(animal.name + " ajouté avec succès!");
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

    public void addAquaticAnimal(Aquatic aquatic){
        if(aquaticCount < MAX_AQUATICS){
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println(aquatic.name + " a été ajouté  avec succés au zoo");
        }else{
            System.out.println("Impossible d'ajouter " +  aquatic.name);
        }

    }

    public float maxPenguinSwimmingDepth(){
        float maxSwimmingDepth = 0.0f;
        for(int i = 0; i < aquaticCount; i++){
            if(aquaticAnimals[i] instanceof  Penguin){
                Penguin p = (Penguin) aquaticAnimals[i];
                if(p.swimmingDepth  > maxSwimmingDepth){
                    maxSwimmingDepth = p.swimmingDepth;
                }

            }
        }
        return maxSwimmingDepth;

    }

    public void displayNumberOfAquaticsByType(){
        int nbrdolphin = 0;
        int nbrpenguin = 0;
        for(int i = 0; i < aquaticCount; i++){
            if(aquaticAnimals[i] instanceof  Dolphin){
                nbrdolphin++;
            } else if (aquaticAnimals[i] instanceof  Penguin){
                nbrpenguin++;
            }
        }
        System.out.println("Nombre de dauphins : " + nbrdolphin);
        System.out.println("Nombre de pingouins : " + nbrpenguin);
    }


}
