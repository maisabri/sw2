package restaurant;

import java.util.ArrayList;

public class Order {

    private static int orderNum = 0 ;
    private final ArrayList <Item> order=new ArrayList<>();
    
    public void addOrder(Item m)
    {
        order.add(m);
    }
    
     
    public void clearOrder()
    {
        order.clear() ;
    }
	 //increament order num 
   

	  public int getNumber()
    {
        return orderNum ;
    }
	public void increamentNo()
    {
        orderNum ++ ;
    }
	
	
}

