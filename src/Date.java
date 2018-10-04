import javax.swing.JOptionPane;
import java.util.*;
import java.text.*;

public class Date {
    public static void main(String[] args) {
        boolean ok = false;
        int bDay = 0, bMonth = 0, bYear = 0, rDay = 0, rMonth = 0, rYear = 0, diff;

        while(ok == false){
            bDay = Integer.parseInt(JOptionPane.showInputDialog("Enter borrow day: "));
            bMonth = Integer.parseInt(JOptionPane.showInputDialog("Enter borrow month: "));
            bYear = Integer.parseInt(JOptionPane.showInputDialog("Enter borrow year: "));

            rDay = Integer.parseInt(JOptionPane.showInputDialog("Enter return day: "));
            rMonth = Integer.parseInt(JOptionPane.showInputDialog("Enter return month: "));
            rYear = Integer.parseInt(JOptionPane.showInputDialog("Enter return year: "));

            if((bYear <= rYear) && (rMonth > bMonth ||(bMonth == rMonth && bDay <= rDay))) {
                ok = true;
            }
        }

        GregorianCalendar borrowDate = new GregorianCalendar(bYear, (bMonth), bDay);
        GregorianCalendar returnDate = new GregorianCalendar(rYear, (rMonth), rDay);

        SimpleDateFormat f = new SimpleDateFormat("dd MM yyyy");

        diff = returnDate.get(Calendar.DAY_OF_YEAR) - borrowDate.get(Calendar.DAY_OF_YEAR) + ((rYear - bYear) * 365);

        JOptionPane.showMessageDialog(null, "Borrow Date: " + f.format(borrowDate.getTime()) + "\n\nReturn Date" +
                f.format(returnDate.getTime()) +
                "\n\n\nYou rented the book for " + diff + " days");
    }
}