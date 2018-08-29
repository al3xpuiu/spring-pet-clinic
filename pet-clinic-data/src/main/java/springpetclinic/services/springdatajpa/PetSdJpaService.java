package springpetclinic.services.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springpetclinic.model.Pet;
import springpetclinic.repositories.PetRepository;
import springpetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Loky on 29/08/2018.
 */
@Service
@Profile( "springdatajpa" )
public class PetSdJpaService implements PetService {

    private PetRepository petRepository;

    @Autowired
    public PetSdJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>(  );
        petRepository.findAll().forEach( pets::add );
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById( aLong ).orElse( null );
    }

    @Override
    public Pet save(Pet obj) {
        return petRepository.save( obj );
    }

    @Override
    public void delete(Pet obj) {
        petRepository.delete( obj );
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById( aLong );
    }
}
