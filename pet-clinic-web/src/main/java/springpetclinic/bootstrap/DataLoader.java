package springpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springpetclinic.model.*;
import springpetclinic.services.*;

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
    private final SpecialtyService specialtyService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... strings) throws Exception {

        if (ownerService.findAll().size() == 0) {
            loadData();
        }

    }

    private void loadData() {

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

        //Specialities - start
        Specialty specialty = new Specialty();
        specialty.setDescription( "Radiology" );
        Specialty savedRadiologySpeciality = specialtyService.save( specialty );

        specialty = new Specialty();
        specialty.setDescription( "Surgery" );
        Specialty savedSurgerySpeciality = specialtyService.save( specialty );

        specialty = new Specialty();
        specialty.setDescription( "Dentistry" );
        Specialty savedDestistrySpeciality = specialtyService.save( specialty );
        //Specialities - end

        System.out.println("Owners loaded...");

        //Vets - start
        Vet vet = new Vet();
        vet.setFirstName( "Sam" );
        vet.setLastName( "Axe" );
        vet.getSpecialties().add( savedRadiologySpeciality );
        vetService.save( vet );

        vet = new Vet();
        vet.setFirstName( "Jessie" );
        vet.setLastName( "Porter" );
        vet.getSpecialties().add( savedSurgerySpeciality );

        vetService.save( vet );
        //Vets - end

        System.out.println("Vets loaded...");
    }
}
