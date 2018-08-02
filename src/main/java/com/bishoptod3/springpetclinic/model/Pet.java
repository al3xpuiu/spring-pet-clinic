package com.bishoptod3.springpetclinic.model;

import java.time.LocalDate;

/**
 * Created by Loky on 02/08/2018.
 */
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
