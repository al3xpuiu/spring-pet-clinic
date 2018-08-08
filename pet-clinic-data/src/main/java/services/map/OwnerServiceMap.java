package services.map;

import model.Owner;

/**
 * Created by Loky on 08/08/2018.
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> {

    @Override
    public Owner save(Owner owner) {
        return super.save( owner.getId(), owner );
    }

}
