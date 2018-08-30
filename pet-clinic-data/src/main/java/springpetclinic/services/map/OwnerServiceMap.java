package springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springpetclinic.model.Owner;
import springpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Loky on 08/08/2018.
 */
@Service
@Profile( {"default", "map"} )
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findByLastName(String lastName) {
        return super.getMap()
                .entrySet()
                .stream()
                .filter( e -> e.getValue().getLastName().equals( lastName ) )
                .map(Map.Entry::getValue )
                .collect( Collectors.toCollection( HashSet<Owner>::new) );
    }
}
