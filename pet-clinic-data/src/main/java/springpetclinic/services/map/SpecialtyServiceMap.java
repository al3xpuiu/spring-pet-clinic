package springpetclinic.services.map;

import org.springframework.stereotype.Service;
import springpetclinic.model.Specialty;
import springpetclinic.services.SpecialtyService;

/**
 * Created by Loky on 18/08/2018.
 */
@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {
}
