package services;

import model.Pet;

import java.util.Set;

/**
 * Created by Loky on 06/08/2018.
 */
public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
