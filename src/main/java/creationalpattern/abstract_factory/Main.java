package creationalpattern.abstract_factory;

public class Main {
    public static void main(String[] args) {
        new AnimalAbstractFactory().createAnimal(AnimalType.SKY, AnimalEra.CENOZOIC);
        new AnimalAbstractFactory().createAnimal(AnimalType.SKY, AnimalEra.MESOZOIC);
        new AnimalAbstractFactory().createAnimal(AnimalType.LAND, AnimalEra.CENOZOIC);
        new AnimalAbstractFactory().createAnimal(AnimalType.LAND, AnimalEra.MESOZOIC);
    }
}
