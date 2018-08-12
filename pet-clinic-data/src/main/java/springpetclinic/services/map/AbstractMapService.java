package springpetclinic.services.map;

import springpetclinic.model.BaseEntity;
import springpetclinic.services.CrudService;

import java.util.*;

/**
 * Created by Loky on 08/08/2018.
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {
    private Map<Long, T> map = new HashMap<>(  );

    public Set<T> findAll() {
        return new HashSet<>( map.values() );
    }

    public T findById(ID id) {
        return map.get( id );
    }

    public T save(T obj) {
        if (obj != null) {
            if (obj.getId() == null) {
                obj.setId( getNextId() );
            }
            map.put( obj.getId(), obj );
        } else {
            throw new IllegalArgumentException( "Object must not be null" );
        }
        return obj;
    }

    public void delete(T obj) {
        map.entrySet().removeIf( entry -> entry.getValue().equals( obj ) );
    }

    public void deleteById(ID id) {
        map.remove( id );
    }

    public Map<Long, T> getMap() {
        return map;
    }

    private Long getNextId() {
        if (!map.isEmpty()){
            return Collections.max( map.keySet() ) + 1;
        } else return 1L;
    }
}
