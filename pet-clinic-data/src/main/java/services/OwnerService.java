package services;

import model.Owner;

import java.util.Set;

/**
 * Created by Loky on 06/08/2018.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Set<Owner> findByLastName(String lastName);

}
