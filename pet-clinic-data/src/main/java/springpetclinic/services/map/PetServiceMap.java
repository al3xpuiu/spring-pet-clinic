package springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springpetclinic.model.Pet;
import springpetclinic.services.PetService;

/**
 * Created by Loky on 08/08/2018.
 */
@Service
@Profile( {"default", "map"} )
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

}
