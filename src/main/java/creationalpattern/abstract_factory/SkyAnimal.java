package creationalpattern.abstract_factory;

public class SkyAnimal extends Animal {
    public SkyAnimal(
            AnimalEra animalEra,
            String name
    ) {
        super(animalEra, AnimalType.SKY, name);
        create();
    }

    @Override
    public void create() {
        System.out.println("Creating a " + animalType + " animal: " + name);
    }
}
