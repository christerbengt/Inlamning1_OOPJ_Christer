package Plants;

public enum PlantType {
    CACTUS,
    PALM_TREE,
    CARNIVOROUS_PLANT;

    // Here the plant creation logic is encapsulated by hiding the details of how each plant type is instantiated.
    public Plant createPlant(String name, double height) {
        switch (this) {
            case CACTUS:
                return new Cactus(name, height);
            case PALM_TREE:
                return new Palmtree(name, height);
            case CARNIVOROUS_PLANT:
                return new CarnivorousPlant(name, height);
            default:
                throw new IllegalArgumentException("Unknown plant type");
        }
    }
}
