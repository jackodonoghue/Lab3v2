import javax.swing.*;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal animal = new Animal();;

        String animalString = animal.setType(JOptionPane.showInputDialog("Enter an animal type: (Enter to exit): "));

        while (!animalString.equals("")){
            animal.setContinents[i](JOptionPane.showInputDialog("Please enter the conints this animal lives in: "));
        }
    }
}