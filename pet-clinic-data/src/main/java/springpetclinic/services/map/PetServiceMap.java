package springpetclinic.services.map;

import org.springframework.stereotype.Service;
import springpetclinic.model.Pet;
import springpetclinic.services.PetService;

/**
 * Created by Loky on 08/08/2018.
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet pet) {
        return super.save( pet.getId(), pet );
    }
}
