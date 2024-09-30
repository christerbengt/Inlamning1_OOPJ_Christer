package Plants;

public class Palmtree extends Plant{
    // Encapsulation of these variables is done by the accessor private
    private static final double WATER_PER_METER = 0.5;
    private static final String FLUID_TYPE = " tap water";

    public Palmtree(String name, double height) {
        super(name, height);
    }
    // The following two overrides are examples of polymorphism. They are also examples of encapsulation in that they control access to data from the private variables in the class.
    @Override
    public double calculateFluid() {
        return WATER_PER_METER * height;
    }

    @Override
    public String getFluidType() {
        return FLUID_TYPE;
    }
}

