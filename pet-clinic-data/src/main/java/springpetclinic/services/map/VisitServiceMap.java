package springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springpetclinic.model.Visit;
import springpetclinic.services.VisitService;

/**
 * Created by Loky on 29/08/2018.
 */
@Service
@Profile( {"default", "map"} )
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService{

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null) {
            throw new IllegalArgumentException( "Invalid Visit" );
        }
        return super.save( visit );
    }
}
