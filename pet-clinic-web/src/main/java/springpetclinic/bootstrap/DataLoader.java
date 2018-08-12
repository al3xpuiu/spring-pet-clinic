package springpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springpetclinic.model.Owner;
import springpetclinic.model.Vet;
import springpetclinic.services.OwnerService;
import springpetclinic.services.VetService;

/**
 * Created by Loky on 12/08/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... strings) throws Exception {

        Owner owner = new Owner();
        owner.setId( 1L );
        owner.setFirstName( "Michael" );
        owner.setLastName( "Weston" );

        ownerService.save( owner );

        owner = new Owner();
        owner.setId( 2L );
        owner.setFirstName( "Fiona" );
        owner.setLastName( "Glenanne" );

        ownerService.save( owner );

        System.out.println("Owners loaded...");

        Vet vet = new Vet();
        vet.setId( 1L );
        vet.setFirstName( "Sam" );
        vet.setLastName( "Axe" );

        vetService.save( vet );

        vet = new Vet();
        vet.setId( 2L );
        vet.setFirstName( "Jessie" );
        vet.setLastName( "Porter" );

        vetService.save( vet );

        System.out.println("Vets loaded...");

    }
}
