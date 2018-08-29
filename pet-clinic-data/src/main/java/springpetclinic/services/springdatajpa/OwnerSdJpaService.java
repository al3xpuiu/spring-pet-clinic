package springpetclinic.services.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springpetclinic.model.Owner;
import springpetclinic.repositories.OwnerRepository;
import springpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Loky on 28/08/2018.
 */
@Service
@Profile( "springdatajpa" )
public class OwnerSdJpaService implements OwnerService {

    private OwnerRepository ownerRepository;

    @Autowired
    public OwnerSdJpaService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findByLastName(String lastName) {
        return ownerRepository.findByLastName( lastName );
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>(  );
        ownerRepository.findAll().forEach( owners::add );
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById( aLong ).orElse( null );
    }

    @Override
    public Owner save(Owner obj) {
        return ownerRepository.save( obj );
    }

    @Override
    public void delete(Owner obj) {
        ownerRepository.delete( obj );
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById( aLong );
    }
}
