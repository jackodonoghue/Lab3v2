import javax.swing.*;

public class FractionDriver {
    public static void main(String[] args) {
        String add, sub, div, mul;

        Fraction fraction = new Fraction();
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();

        fraction1.setNum(Double.parseDouble(JOptionPane.showInputDialog("Please enter the numerator of fraction 1:")));
        fraction1.setDen(Double.parseDouble(JOptionPane.showInputDialog("Please enter the denominator of fraction 1:")));

        fraction2.setNum(Double.parseDouble(JOptionPane.showInputDialog("Please enter the numerator of fraction 2:")));
        fraction2.setDen(Double.parseDouble(JOptionPane.showInputDialog("Please enter the denominator of fraction 2:")));

        add = fraction.addFraction(fraction1.getNum(),fraction2.getNum(), fraction1.getDen(),fraction2.getDen());
        sub = fraction.subFraction(fraction1.getNum(),fraction2.getNum(), fraction1.getDen(),fraction2.getDen());
        div = fraction.divFraction(fraction1.getNum(),fraction2.getNum(), fraction1.getDen(),fraction2.getDen());
        mul = fraction.mulFraction(fraction1.getNum(),fraction2.getNum(), fraction1.getDen(),fraction2.getDen());

        System.out.println("testing the no-arg contructor: " + fraction + "\ntesting the 2 arg cons: " + fraction1 +
                "\n\n" + add + "\n\n" + sub + "\n\n" + mul + "\n\n" + div);
    }
}