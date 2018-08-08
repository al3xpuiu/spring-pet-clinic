package services.map;

import model.Vet;

/**
 * Created by Loky on 08/08/2018.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> {

    @Override
    public Vet save(Vet vet) {
        return super.save( vet.getId(), vet );
    }
}
