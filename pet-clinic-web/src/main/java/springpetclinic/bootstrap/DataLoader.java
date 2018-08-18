package springpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springpetclinic.model.Owner;
import springpetclinic.model.Pet;
import springpetclinic.model.PetType;
import springpetclinic.model.Vet;
import springpetclinic.services.OwnerService;
import springpetclinic.services.PetService;
import springpetclinic.services.PetTypeService;
import springpetclinic.services.VetService;

import java.time.LocalDate;

/**
 * Created by Loky on 12/08/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public void run(String... strings) throws Exception {

        //PetTypes - start
        PetType petType = new PetType();
        petType.setName( "Dog" );
        PetType savedDogPetType = petTypeService.save( petType );

        petType = new PetType();
        petType.setName( "Cat" );
        PetType savedCatPetType = petTypeService.save( petType );
        //PetTypes - end

        //Owner 1 - start
        Owner owner = new Owner();
        owner.setFirstName( "Michael" );
        owner.setLastName( "Weston" );
        owner.setAddress( "123 Brickerel" );
        owner.setCity( "Miami" );
        owner.setTelephone( "0443 323 665 333" );
        Pet pet = new Pet();
        pet.setName( "Deli" );
        pet.setBirthDate( LocalDate.now() );
        pet.setPetType( savedDogPetType );
        pet.setOwner( owner );
        owner.getPets().add( pet );

        petService.save( pet );
        ownerService.save( owner );
        //Owner 1 - end

        //Owner 2 - start
        owner = new Owner();
        owner.setFirstName( "Fiona" );
        owner.setLastName( "Glenanne" );
        owner.setAddress( "56 Further Str." );
        owner.setCity( "Caesura" );
        owner.setTelephone( "0132 343 115 729" );
        pet = new Pet();
        pet.setName( "Tim" );
        pet.setBirthDate( LocalDate.now() );
        pet.setPetType( savedCatPetType );
        pet.setOwner( owner );
        owner.getPets().add( pet );

        petService.save( pet );
        ownerService.save( owner );
        //Owner 2 - end


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
