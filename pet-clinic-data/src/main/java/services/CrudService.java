package services;


import java.util.Set;

/**
 * Created by Loky on 07/08/2018.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T obj);

    void delete(T obj);
    
    void deleteById(ID id);
}
