public class Message {
    private String sender;
    private String reciever;
    private String message;

    public String getSender(){
        return sender;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public String getReciever(){
        return reciever;
    }

    public void setReciever(String reciever){
        this.reciever = reciever;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String toString(){
        return "From: " + sender + "\nTo: " + reciever + "\nMessage: " + message;
    }

    public Message(){
        this("No Sender", "No Reciever", "No Message");
    }

    public Message(String s, String r, String m) {
        this.sender = s;
        this.reciever = r;
        this.message = m;
    }

    public String append(String message){
       if(!message.equals("-1"))
       {
           this.message += "\n" + message ;
       }

        return message;
    }
}
