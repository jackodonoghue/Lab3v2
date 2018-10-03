

import javax.swing.*;

public class MessageDriver {
    public static void main(String[] args) {
        Message message1 = new Message();
        String in = "";

        message1.setSender(JOptionPane.showInputDialog("Please enter the name of the sender: "));
        message1.setReciever(JOptionPane.showInputDialog("Please enter the name of the reciever: "));
        message1.setMessage(JOptionPane.showInputDialog("Please enter the name of the message: "));

        while(!in.equals("-1")){
           in =  message1.append(JOptionPane.showInputDialog("Add to message (-1 to exit)"));
        }

        JOptionPane.showMessageDialog(null, message1);

    }
}