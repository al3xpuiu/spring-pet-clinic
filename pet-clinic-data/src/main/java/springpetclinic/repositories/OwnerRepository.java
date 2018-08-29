package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Loky on 28/08/2018.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Set<Owner> findByLastName(String lastName);
}
