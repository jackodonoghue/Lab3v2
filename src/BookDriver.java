import javax.swing.*;
import java.awt.*;

public class BookDriver {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setTitle("Hairy Pooter");
        book1.setISBN("978-3-16-148410-0");
        book1.setPages(250);
        book1.setPrice(12.99);

        book2.setTitle("Hairy Pooter and the hard boiled egg");
        book2.setISBN("978-3-16-148410-0");
        book2.setPages(255);
        book2.setPrice(21.99);

        JOptionPane.showMessageDialog(null, book1 +"\n\n" + book2);

        driver2();
    }

    public static void driver2 (){
        Book favBook = new Book();
        Book leastFavBook = new Book();

        favBook.setTitle(JOptionPane.showInputDialog("Please enter the name of your favourite book: "));
        favBook.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book: ")));
        favBook.setPages(Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages: ")));

        leastFavBook.setTitle(JOptionPane.showInputDialog("Please enter the name of your favourite book: "));
        leastFavBook.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book: ")));
        leastFavBook.setPages(Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages: ")));

        JTextArea textArea = new JTextArea(20,20);
        textArea.setFont(new Font ("Monospaced", Font.PLAIN, 16));
        textArea.append(favBook + "\n\n" + leastFavBook);

        JOptionPane.showMessageDialog(null, textArea);
    }

}