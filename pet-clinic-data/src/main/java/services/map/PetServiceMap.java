package services.map;

import model.Pet;
import services.PetService;

/**
 * Created by Loky on 08/08/2018.
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet pet) {
        return super.save( pet.getId(), pet );
    }
}
