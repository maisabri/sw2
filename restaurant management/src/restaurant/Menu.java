package restaurant;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Menu {
	
    private final ArrayList<Item> food=new ArrayList<>();
    private final ArrayList<Item> drinks=new ArrayList<>();

    public Menu() {
        	write_file_DRINK();
        	write_file_food();
        }
        
    public void write_file_DRINK(){    
            String f = "drink.txt";
             
            try
            {
            FileWriter fw=new FileWriter(f);
            BufferedWriter bw = new BufferedWriter (fw);
            drinks.add(new Item("Pepsi","drink",7));
            drinks.add(new Item("Juice","drinks",10));
            drinks.add(new Item("Tea","drink",5));
            drinks.add(new Item("Coffee","drink",8));
           
           for (Item line : drinks) {
               bw.write (line +"");
               bw.newLine(); } 
               bw.close();
               }
            catch(IOException e) {
            	System.err.println("can't do this operation");
            }
   }
    public void write_file_food(){
       
    String FNAME = "food.txt";
  
       try {
    	    FileWriter fw=new FileWriter(FNAME); 
    	   BufferedWriter bw = new BufferedWriter (fw);
           food.add(new Item("Grilled Salmon With Sauce","food",200));
           food.add(new Item("Roast Beef With Vegetables","food",150));
           food.add(new Item("Chiken And Mushroom Pie","food",120));
           food.add(new Item("Marrakesh Vegetarian Curry","food",100));
           
           for (Item line : food) {
               bw.write (line +"");
               bw.newLine();} 
               bw.close();
                }
       catch(IOException e) {
       	System.err.println("can't do this operation");
       }
   }
	
    public String displayFood() {
 	   String menu1=" ";
 	   menu1+= "Food Menu : \n";
 	   for(int i = 0 ; i<food.size() ; i++) {
 		   Item a= food.get(i);
 		   menu1+= (i+1) + " - " + a.toString() + "\n";
 	   }
 		 return menu1;  
    }
    
    public String displayDrinks() {
 	   String menu1=" ";
 	   menu1+= "drinks Menu : \n";
 	   for(int i = 0 ; i<drinks.size() ; i++) {
 		   Item a= drinks.get(i);
 		   menu1+= (i+1) + " - " + a.toString() + "\n";
 	   }
 		 return menu1;  
    }
    
    //remove a meal from the menu
   public void removeFood (int i) {
	   food.remove(i-1);
   }
   
 //remove a drink from the menu
   public void removeDrink (int i) {
	   drinks.remove(i-1);
   }
	
	public void addFood(String name,double price) {
	   food.add(new Item(name,"food",price));
   }
   
  
   public void addDrink(String name,double price) {
	   drinks.add(new Item(name,"drinks",price));
	   
   }
	
   public int searchFood(String name) {
	  for(int i=0;i<food.size();i++) {
		 Item a=food.get(i);
		  if(name == null ? a.name == null : name.equals(a.name)) {
			  return i+1;}
		  }
	  return 0;
   }
   
   
   public int searchDrink(String name) {
	   for(int i=0;i<drinks.size();i++) {
			 Item a=drinks.get(i);
			  if(name == null ? a.name == null : name.equals(a.name)) {
				  return i+1;}
			  }
		  return 0;
   }
	public void updateFood(int i, String name1 , double price1) {
	   Item a=new Item(name1,"food",price1);
	   food.set(i-1, a);
	 public void updateDrink(int i, String name1 , double price1) {
	   Item a=new Item(name1,"drink",price1);
	   food.set(i-1, a);
   }
   
}
