package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Visit;

/**
 * Created by Loky on 28/08/2018.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
