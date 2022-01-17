package OOPDemo;
public class Book {
    private String ID;
    private String name;
    private String author;
    private double price;
    private int quantity;

    public Book() {
    }

    public Book(String ID, String name, String author, double price, int quantity) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString (){
        return (ID+'\t'+name+'\t'+author+'\t'+price+'\t'+quantity);
    }
    
    

}
