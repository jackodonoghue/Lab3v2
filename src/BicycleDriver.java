import javax.swing.*;

public class BicycleDriver {
    public static void main(String[] args) {
        double value;

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();

        bicycle2.setName(JOptionPane.showInputDialog("Please enter the name of the bike owner:"));
        bicycle2.setValue(Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of the bike:")));
        bicycle2.setMake(JOptionPane.showInputDialog("Please enter the make of the bike:"));

        bicycle2.setValue(bicycle2.getValue() + 10);

        JOptionPane.showMessageDialog(null, "Bike 1 owner name: " + bicycle.getName() +
                "\nBike 1 value: " + bicycle.getValue() + "\nBike 1 Make: " + bicycle.getMake() +
                "\n\nBike 2 owner name: " + bicycle2.getName() +
                "\nBike 2 value: " + bicycle2.getValue() + "\nBike 2 Make: " + bicycle2.getMake() +
                "\n\nThe value of both bikes is " + (bicycle.getValue() + bicycle2.getValue()));
    }
}
