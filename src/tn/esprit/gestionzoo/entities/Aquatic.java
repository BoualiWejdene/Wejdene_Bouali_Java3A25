package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{

    protected String habitat;

    public Aquatic() {

    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat ;
    }

    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic a = (Aquatic) obj;
        return this.name.equals(a.name) && this.age == a.age && this.habitat.equals(a.habitat);
    }

}
