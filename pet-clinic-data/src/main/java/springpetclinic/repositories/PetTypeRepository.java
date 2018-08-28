package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.PetType;

/**
 * Created by Loky on 28/08/2018.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
