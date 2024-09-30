package Plants;

public abstract class Plant implements IPlant {
        // By using the protected accessor I encapsulate the variables.
        protected String name;
        protected double height;

        public Plant(String name, double height) {
            this.name = name;
            this.height = height;
        }
        // Polymorphism is used by having the following two abstract methods which are then overridden in each subclass with methods with the same names but class specific content.
        public abstract double calculateFluid();
        public abstract String getFluidType();

        // This getter controls how the data from the variable is accessed.
        public String getName() {
            return name;
        }
}
