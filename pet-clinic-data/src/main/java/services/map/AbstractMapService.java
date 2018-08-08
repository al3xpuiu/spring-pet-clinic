package services.map;

import services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Loky on 08/08/2018.
 */
public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {
    private Map<ID, T> map = new HashMap<>(  );

    public Set<T> findAll() {
        return new HashSet<>( map.values() );
    }

    public T findById(ID id) {
        return map.get( id );
    }

    T save(ID id, T obj) {
        map.put( id, obj );
        return obj;
    }

    public void delete(T obj) {
        map.entrySet().removeIf( entry -> entry.getValue().equals( obj ) );
    }

    public void deleteById(ID id) {
        map.remove( id );
    }
}
