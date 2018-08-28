package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Specialty;

/**
 * Created by Loky on 28/08/2018.
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
