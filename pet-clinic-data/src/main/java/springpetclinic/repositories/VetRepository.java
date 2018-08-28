package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Vet;

/**
 * Created by Loky on 28/08/2018.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
