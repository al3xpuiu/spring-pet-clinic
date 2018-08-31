package springpetclinic.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Loky on 17/08/2018.
 */
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    @Builder
    public Specialty(Long id, String description) {
        super( id );
        this.description = description;
    }

    @Column(name = "description")
    private String description;

}
