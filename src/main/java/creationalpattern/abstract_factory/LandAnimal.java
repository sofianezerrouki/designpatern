package creationalpattern.abstract_factory;

public class LandAnimal extends Animal {
    public LandAnimal(
            AnimalEra animalEra,
            String name
    ) {
        super(animalEra, AnimalType.LAND, name);
        create();
    }

    @Override
    public void create() {
        System.out.println("Creating a " + animalType + " animal: " + name);
    }
}
