package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Owner;

/**
 * Created by Loky on 28/08/2018.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
