package restaurant;
public interface Interface2 {
   
	interface forAdmin{
		 public String displayFood();
		 public String displayDrinks();
		 public int searchFood(String name);
		 public int searchDrink(String name);
		 public void addFood(String name,double price);
		 public void addDrink(String name,double price);
     		 public void removeFood (int i);
		 public void removeDrink (int i);
		 public void updateFood(int i,String name1,double price1);
		 public void updateDrink(int i,String name1,double price1);
	}
     }
