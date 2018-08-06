package services;

import model.Vet;

import java.util.Set;

/**
 * Created by Loky on 06/08/2018.
 */
public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
