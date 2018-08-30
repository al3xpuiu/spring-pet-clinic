package springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springpetclinic.model.PetType;
import springpetclinic.services.PetTypeService;

/**
 * Created by Loky on 17/08/2018.
 */
@Service
@Profile( {"default", "map"} )
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
}
