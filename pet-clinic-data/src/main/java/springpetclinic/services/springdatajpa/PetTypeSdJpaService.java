package springpetclinic.services.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springpetclinic.model.PetType;
import springpetclinic.repositories.PetTypeRepository;
import springpetclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Loky on 29/08/2018.
 */
@Service
@Profile( "springdatajpa" )
public class PetTypeSdJpaService implements PetTypeService {

    private PetTypeRepository petTypeRepository;

    @Autowired
    public PetTypeSdJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>(  );
        petTypeRepository.findAll().forEach( petTypes::add );
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById( aLong ).orElse( null );
    }

    @Override
    public PetType save(PetType obj) {
        return petTypeRepository.save( obj );
    }

    @Override
    public void delete(PetType obj) {
        petTypeRepository.delete( obj );
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById( aLong );
    }
}
