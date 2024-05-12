package creationalpattern.abstract_factory;

public class AnimalAbstractFactory {
    Animal animal;

    public void createAnimal(AnimalType animalType, AnimalEra animalEra) {
        switch (animalEra) {
            case CENOZOIC -> animal = new CenozoicAnimalFactory().createAnimal(animalType);
            case MESOZOIC -> animal = new MesozoicAnimalFactory().createAnimal(animalType);
            default -> {
            }
        }
    }
}
