package Plants;

public class CarnivorousPlant extends Plant {
    // Setting accessors to private is an example of encapsulation.
    private static final double BASE_AMOUNT = 0.1;
    private static final double EXTRA_PER_METER = 0.2;
    private static final String FLUID_TYPE = "protein solution";

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }
    // // The following two overrides are examples of polymorphism. They are also examples of encapsulation in that they control access to data from the private variables in the class.
    @Override
    public double calculateFluid() {
        return BASE_AMOUNT + (EXTRA_PER_METER * height);
    }
    @Override
    public String getFluidType() {
        return FLUID_TYPE;
    }
}
