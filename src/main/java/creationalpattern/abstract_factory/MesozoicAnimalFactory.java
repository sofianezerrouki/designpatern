package creationalpattern.abstract_factory;

public class MesozoicAnimalFactory implements EraAnimalFactory {

    @Override
    public LandAnimal makeLandAnimal() {
        return new LandAnimal(AnimalEra.MESOZOIC, "Land, MESOZOIC");
    }

    @Override
    public SkyAnimal makeSkyAnimal() {
        return new SkyAnimal(AnimalEra.MESOZOIC, "Sky, MESOZOIC");
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
