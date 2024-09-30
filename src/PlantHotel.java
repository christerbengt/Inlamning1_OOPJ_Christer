import Plants.*;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class PlantHotel {
    // Declaring the plants list as private restricts access from outside the class.
    private static List<Plant> plants = new ArrayList<>();

    // Declaring these strings as private constants protects them from being accessed from other classes and is an example of encapsulation.
    private static final String INPUT_MESSAGE = "Which plant should receive fluid?";
    private static final String NOT_FOUND_MESSAGE = "No such plant in the hotel.";
    private static final String OUTPUT_FORMAT = "%s should get %.2f litres %s";

    public static void main(String[] args) {
        initializePlants();

        while (true) {
            String input = JOptionPane.showInputDialog(INPUT_MESSAGE);

            if (input == null) {
                break;  // End program if user pushes cancel button.
            }

            PlantName plantName = PlantName.fromString(input);
            if (plantName != null) {
                Plant plant = findPlant(plantName.getName());
                if (plant != null) {
                double amount = plant.calculateFluid();
                String type = plant.getFluidType();
                JOptionPane.showMessageDialog(null,
                            String.format(OUTPUT_FORMAT, plant.getName(), amount, type));
                } else {
                    JOptionPane.showMessageDialog(null, NOT_FOUND_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, NOT_FOUND_MESSAGE);
            }
        }
    }

    // Using the methods initializePlants and findPlant to manage the internal state of the plants list is an example of encapsulation.
    private static void initializePlants() {
        for (PlantName plantName : PlantName.values()) {
            plants.add(plantName.createPlant());
        }
    }
    private static Plant findPlant(String name) {
        for (Plant plant : plants) {
            if (plant.getName().equalsIgnoreCase(name)) {
                return plant;
            }
        }
        return null;
    }
}