
import models.Animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AnimalShelter implements Serializable {

    /*** Then name of the animal shelfter*/
    private String name;

    /*** List of animal , initially empty by default.*/
    private List<Animal> animals;

    /**
     * Constructor
     *
     * @param name the name of the shelter
     */
    public AnimalShelter(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }

    /**
     * Method to return the animal list
     *
     * @return the animal list
     */
    public List<Animal> getAnimals() {
        return animals;
    }

    /**
     * Method to add animal to the list
     *
     * @param newAnimal the animal to be added
     */
    public void addAnimal(Animal newAnimal) {
        if (!shouldAllowToAddAnimal(newAnimal.getId())) {
            animals.add(newAnimal);
        }
    }

    /**
     * Method to check if the list contains animal
     *
     * @param id the id of the animal
     * @return true if animal is found, false otherwise.
     */
    public boolean shouldAllowToAddAnimal(int id) {
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to retrieve an animal by id
     *
     * @param id the id of the Animal in the shelter
     * @return Animal the animal found, null otherwise
     */
    public Animal getAnimalById(int id) {
        for (Animal animal : animals) {
            if(animal.getId() == id){
                return animal;

            }        }
        return null;
    }

}
