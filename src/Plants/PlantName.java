package Plants;

public enum PlantName {
    IGGE("igge", PlantType.CACTUS, 0.2),
    LAURA("laura", PlantType.PALM_TREE, 5.0),
    MEATLOAF("meatloaf", PlantType.CARNIVOROUS_PLANT, 0.7),
    OLOF("olof", PlantType.PALM_TREE, 1.0);

    // Having private variables here is an example of encapsulation.
    private final String name;
    private final PlantType type;
    private final double height;

    PlantName(String name, PlantType type, double height) {
        this.name = name;
        this.type = type;
        this.height = height;
    }

    // This getter controls access to data from the variable name and is an example of encapsulation.
    public String getName() {
        return name;
    }

    // In this method I've encapsulated the plant creation logic.
    public Plant createPlant() {
        return type.createPlant(name, height);
    }

    public static PlantName fromString(String name) {
        for (PlantName plantName : values()) {
            if (plantName.name.equalsIgnoreCase(name)) {
                return plantName;
            }
        }
        return null;
    }
}