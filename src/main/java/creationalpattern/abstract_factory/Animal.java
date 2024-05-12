package creationalpattern.abstract_factory;


public abstract class Animal {
    AnimalEra animalEra;
    AnimalType animalType;
    String name;

    public Animal(AnimalEra animalEra, AnimalType animalType, String name) {
        this.animalEra = animalEra;
        this.animalType = animalType;
        this.name = name;
    }

    public abstract void create();
}
