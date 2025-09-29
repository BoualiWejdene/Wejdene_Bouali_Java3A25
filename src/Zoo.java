public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo() {
        animals = new Animal[25];

    }

    public Zoo(String name,String city,int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
        this.nbrCages = nbrCages;

    }



}
