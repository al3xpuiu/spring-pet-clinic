package springpetclinic.model;

import java.util.Set;

/**
 * Created by Loky on 02/08/2018.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
