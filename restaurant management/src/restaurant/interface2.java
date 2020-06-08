package restaurant;
public interface Interface2 {
   
	interface forAdmin{
		 public String displayFood();
		 public String displayDrinks();
		 public int searchFood(String name);
		 public int searchDrink(String name);
		 public void addFood(String name,double price);
		 public void addDrink(String name,double price);
     
     }
