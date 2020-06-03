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
	
	  public String toString()
    {
        String str = " ";
        for (int i=0;i<order.size();i++)
        {
            str +=order.get(i).toString()+"\n\n";
        }
        return str;
    }
}

}

