package creationalpattern.abstract_factory;

public class CenozoicAnimalFactory implements EraAnimalFactory {

    @Override
    public LandAnimal makeLandAnimal() {
        return new LandAnimal(AnimalEra.CENOZOIC,"CENOZOIC" );
    }

    @Override
    public SkyAnimal makeSkyAnimal() {
        return new SkyAnimal(AnimalEra.CENOZOIC, "CENOZOIC");
    }

    Animal createAnimal(AnimalType animalType) {
        switch (animalType) {
            case SKY -> {
                return makeSkyAnimal();
            }
            case LAND -> {
                return makeLandAnimal();
            }
            default -> {
                return null;
            }
        }
    }
}
