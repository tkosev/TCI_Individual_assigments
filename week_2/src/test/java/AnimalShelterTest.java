import models.Animal;
import models.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void addAnimal() {
        AnimalShelter animalShelter = new AnimalShelter("My Shelter");
        int nrOfAnimals;

        Animal dog = createAnimal();
        // act
        animalShelter.addAnimal(dog);
        // assert
        nrOfAnimals = animalShelter.getAnimals().size();
        assertEquals(1, nrOfAnimals);
        assertTrue(animalShelter.getAnimals().contains(dog));
    }

    @Test
    public void shouldAllowToAddAnimal() {
        AnimalShelter animalShelter = new AnimalShelter("My Shelter");
        int nrOfAnimals;

        Animal dog = createAnimal();

        //Add teh dog
        animalShelter.addAnimal(dog);

        // act
        boolean actual = animalShelter.shouldAllowToAddAnimal(dog.getId());

        assertEquals(false, actual);
    }

    @Test
    public void getAnimalById() {
        AnimalShelter animalShelter = new AnimalShelter("My Shelter");

        Animal dog = createAnimal();

        //Add teh dog
        animalShelter.addAnimal(dog);

        Animal expectedDog = animalShelter.getAnimalById(dog.getId());

        assertEquals(expectedDog,dog);


    }

    private Animal createAnimal() {
        Animal dog = new Dog();
        dog.setId(1);
        dog.setAge(5);
        dog.setName("Jacky");
        return dog;
    }
}