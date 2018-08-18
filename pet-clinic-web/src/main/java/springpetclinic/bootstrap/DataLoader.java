package springpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springpetclinic.model.Owner;
import springpetclinic.model.PetType;
import springpetclinic.model.Vet;
import springpetclinic.services.OwnerService;
import springpetclinic.services.PetTypeService;
import springpetclinic.services.VetService;

/**
 * Created by Loky on 12/08/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... strings) throws Exception {

        PetType petType = new PetType();
        petType.setName( "Dog" );
        PetType savedDogPetType = petTypeService.save( petType );

        petType = new PetType();
        petType.setName( "Cat" );
        PetType savedCatPetType = petTypeService.save( petType );

        Owner owner = new Owner();
        owner.setFirstName( "Michael" );
        owner.setLastName( "Weston" );

        ownerService.save( owner );

        owner = new Owner();
        owner.setFirstName( "Fiona" );
        owner.setLastName( "Glenanne" );

        ownerService.save( owner );

        System.out.println("Owners loaded...");

        Vet vet = new Vet();
        vet.setFirstName( "Sam" );
        vet.setLastName( "Axe" );

        vetService.save( vet );

        vet = new Vet();
        vet.setFirstName( "Jessie" );
        vet.setLastName( "Porter" );

        vetService.save( vet );

        System.out.println("Vets loaded...");

    }
}
