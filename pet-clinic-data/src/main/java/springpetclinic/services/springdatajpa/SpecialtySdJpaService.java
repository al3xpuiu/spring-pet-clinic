package springpetclinic.services.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springpetclinic.model.Specialty;
import springpetclinic.repositories.SpecialtyRepository;
import springpetclinic.services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Loky on 29/08/2018.
 */
@Service
@Profile( "springdatajpa" )
public class SpecialtySdJpaService implements SpecialtyService {

    private SpecialtyRepository specialtyRepository;

    @Autowired
    public SpecialtySdJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>(  );
        specialtyRepository.findAll().forEach( specialties::add );
        return specialties;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyRepository.findById( aLong ).orElse( null );
    }

    @Override
    public Specialty save(Specialty obj) {
        return specialtyRepository.save( obj );
    }

    @Override
    public void delete(Specialty obj) {
        specialtyRepository.delete( obj );
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById( aLong );
    }
}
