package springpetclinic.services.map;

import org.springframework.stereotype.Service;
import springpetclinic.model.PetType;
import springpetclinic.services.PetTypeService;

/**
 * Created by Loky on 17/08/2018.
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
}
