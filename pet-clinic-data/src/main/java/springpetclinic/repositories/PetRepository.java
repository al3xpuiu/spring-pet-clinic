package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Pet;

/**
 * Created by Loky on 28/08/2018.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
