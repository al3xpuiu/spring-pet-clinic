package springpetclinic.services.map;

import org.springframework.stereotype.Service;
import springpetclinic.model.Vet;
import springpetclinic.services.VetService;

/**
 * Created by Loky on 08/08/2018.
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet save(Vet vet) {
        return super.save( vet );
    }
}
