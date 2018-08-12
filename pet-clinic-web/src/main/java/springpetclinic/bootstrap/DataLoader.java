package springpetclinic.bootstrap;

import model.Owner;
import model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.VetService;
import services.map.OwnerServiceMap;
import services.map.VetServiceMap;

/**
 * Created by Loky on 12/08/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
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
