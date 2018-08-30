package springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springpetclinic.model.Vet;
import springpetclinic.services.VetService;

/**
 * Created by Loky on 08/08/2018.
 */
@Service
@Profile( {"default", "map"} )
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

}
