package restauranttt;

/**
 *
 * @author DELL LAPTOP
 */
public interface Interface1 {


	interface forEmployee{
		public void addOrder(Menu m);
		 public void removeItem(Menu m);
		 public Menu getItem(int index);
		 public void clearOrder();
		 public int getSize();
		 public int getNumber();
		 public void increamentNo();
		 public String toString();
		 public double tax();
		 public double tip();
		 public double totalBill();
		 public String displayFood();
		 public String displayDrinks();
		 public int searchFood(String name);
		 public int searchDrink(String name);
     
     
     
	}
}
