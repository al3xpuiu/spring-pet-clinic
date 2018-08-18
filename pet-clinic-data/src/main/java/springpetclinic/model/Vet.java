package springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Loky on 02/08/2018.
 */
public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>(  );

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
