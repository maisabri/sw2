package restaurant;

public class Item {
    String name;
    String category;
    double price;
    
     public Item(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return category+":\n"+name+"\t"+"$"+price;
    }
    
}
