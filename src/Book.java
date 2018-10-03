public class Book {
    private String title;
    private String ISBN;
    private int pages;
    private double price;

    //Accessor and mutators
    public String getTitle(){
        return  title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String toString(){
        return String.format("%-20s%-20s%-20s%-20s%-20s%-20d%-20s%-20.2f","Title: ",title,"\nISBN: ",ISBN,"\nPages: ",pages,"\nPrice",price);
    }

    public  Book(){
        this("No Title", "no isbn", 0, 0.00);
    }

    public Book(String t, String i, int p, double pr){
        this.title = t;
        this.ISBN = i;
        this.pages = p;
        this.price = pr;
    }
}
