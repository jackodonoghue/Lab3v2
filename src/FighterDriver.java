import javax.swing.*;

public class FighterDriver {
    public static void main(String[] args) {
        String output = "";

        Fighter fighter = new Fighter();
        Fighter fighter1 = new Fighter();

        fighter.setName("Conor McGregor");
        fighter.setWeight(155);
        fighter.setRecord("21-3-0");

        fighter1.setName("Khabib Nurmagomedov");
        fighter1.setWeight(155);
        fighter1.setRecord("26-0-0");

        JOptionPane.showMessageDialog(null, fighter.toString() + "\n\n" + fighter1.toString(),
                "Fighter Details", JOptionPane.INFORMATION_MESSAGE);
    }
}
