package services;

import model.Owner;

import java.util.Set;

/**
 * Created by Loky on 06/08/2018.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
