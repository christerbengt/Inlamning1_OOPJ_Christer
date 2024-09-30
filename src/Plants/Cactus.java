package Plants;

public class Cactus extends Plant{
    // The accessor private on the variables here is an example of encapsulation.
    private static final double WATER_AMOUNT = 0.02;
    private static final String FLUID_TYPE = "mineral water";

    public Cactus(String name, double height) {
        super(name, height);
    }
    // // The following two overrides are examples of polymorphism. They are also examples of encapsulation in that they control access to data from the private variables in the class.
    @Override
    public double calculateFluid() {
        return WATER_AMOUNT;
    }
    @Override
    public String getFluidType() {
        return FLUID_TYPE;
    }
}
