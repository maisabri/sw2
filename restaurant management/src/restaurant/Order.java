package restaurant;

import java.util.ArrayList;

public class Order {

	private static int orderNum = 0 ;
    private final ArrayList <Item> order=new ArrayList<>();
    
    public void addOrder(Item m)
    {
        order.add(m);
    }
    
}
