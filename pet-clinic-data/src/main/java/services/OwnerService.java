package services;

import model.Owner;

/**
 * Created by Loky on 06/08/2018.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
