package springpetclinic.services.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springpetclinic.model.Visit;
import springpetclinic.repositories.VisitRepository;
import springpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Loky on 30/08/2018.
 */
@Service
@Profile( "springdatajpa" )
public class VisitSdJpaService implements VisitService {

    private VisitRepository visitRepository;

    @Autowired
    public VisitSdJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>(  );
        visitRepository.findAll().forEach( visits::add );
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById( aLong ).orElse( null );
    }

    @Override
    public Visit save(Visit obj) {
        return visitRepository.save( obj );
    }

    @Override
    public void delete(Visit obj) {
        visitRepository.delete( obj );
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById( aLong );
    }
}
