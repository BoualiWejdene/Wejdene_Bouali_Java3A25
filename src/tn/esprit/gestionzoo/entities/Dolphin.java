package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    float swimmingSpeed;

    public Dolphin() {

    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
}
