package restaurant;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class Employee {

  EmployeeFile e;
	Customer c;
	Menu u;
  private final ArrayList<Customer> customerList =new ArrayList<>();
  public final ArrayList<File> file =new ArrayList<>();
  static int i=0;
  
  void addCustomer(String Name_Customer) {
            try {
            file.add(new File("Customer"+ i + ".txt"));
            Customer a=new Customer(Name_Customer);
            Writer fileWriter= new FileWriter("Customer"+ i + ".txt");
                
            try (BufferedWriter pw = new BufferedWriter(fileWriter))
            {
                    customerList.add(a);
                    pw.write("Customer's name : " + Name_Customer +"\t" + "ID : "+ i);
                    i++;
            }
                }
            catch(IOException e)
            {
                  System.err.println("error");
            }
         }
        
	


	
   void deleteCustomer(int id){
        customerList.remove(id);
        File x=file.get(id);
        x.delete();
        }
	
 String list()
       {
           String s=" ";
           s+="Customers:  \n Name\t\t\t\t Id \n\n";
           for(int v=0;v<customerList.size();v++)
           {
             Customer c=  customerList.get(v);
             s+=(v+1) +" - "+c.toString()+" \t "+v+"\n";
           }
           return s;
       }
	
	void updateCustomer(int ID_Customer,String Name_Customer) {
    	 try {
            File a=new File("employee"+ ID_Customer + ".txt");
    	    Writer fileWriter= new FileWriter(a);
                 try (BufferedWriter pw = new BufferedWriter(fileWriter)) {
                     pw.write("Customer's name : " + Name_Customer +"\r\n" + "Customer ID : "+ i + "\r\n");
                     file.set(ID_Customer,a);
                 }         
   	    Customer b=new Customer(Name_Customer);
   	    customerList.set(ID_Customer, b);
    	 }

     }
}
