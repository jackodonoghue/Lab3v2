import javax.swing.*;

public class MyPointDriver {
    public static void main(String[] args) {
        MyPoint point = new MyPoint();

        point.setxVal(Integer.parseInt(JOptionPane.showInputDialog("Enter X Co-Ord:")));
        point.setyVal(Integer.parseInt(JOptionPane.showInputDialog("Enter Y Co-Ord:")));

        int newX = point.moveHorizontally(Integer.parseInt(JOptionPane.showInputDialog("Move horizontally:")));

        JOptionPane.showMessageDialog(null, "The new point is (" + newX +
                "," + point.getyVal() + ")");

        int newY = point.moveVertically(Integer.parseInt(JOptionPane.showInputDialog("Move vertically:")));

        JOptionPane.showMessageDialog(null, "The new point is " + point.getxVal() +
                "," + newY + ")");

        int transX = Integer.parseInt(JOptionPane.showInputDialog("Please enter translation for x value:"));
        int transY = Integer.parseInt(JOptionPane.showInputDialog("Please enter translation for y value:"));

        point.translate(transX, transY);

        JOptionPane.showMessageDialog(null, "The new point is " + point +
                "The distance from the origin is " + point.distanceFromOrigin());
    }
}
