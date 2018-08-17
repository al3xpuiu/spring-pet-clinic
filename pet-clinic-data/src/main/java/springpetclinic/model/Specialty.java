package springpetclinic.model;

/**
 * Created by Loky on 17/08/2018.
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
