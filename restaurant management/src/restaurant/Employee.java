import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 *
 * @author DELL LAPTOP
 */


public class Employee extends User implements Interface1{
  
	EmployeeFile e;
	Customer c;
	Menu u;
    private final ArrayList<Customer> customerList =new ArrayList<>();
    public final ArrayList<File> file =new ArrayList<>();
    static int i=0;

    
        //function add customer and create profile to this customer//
   
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
