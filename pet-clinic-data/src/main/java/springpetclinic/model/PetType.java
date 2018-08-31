package springpetclinic.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Loky on 02/08/2018.
 */
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    @Builder
    public PetType(Long id, String name) {
        super( id );
        this.name = name;
    }

    @Column(name = "name")
    private String name;

}
