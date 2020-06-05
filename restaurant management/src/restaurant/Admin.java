package restaurant;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import restaurant.EmployeeFile;

public class Admin {
	//attributes
	  public String username;
	  private int password;
	  //Employee e;

	    public String getUsername() {
		return username;
	}

	    
	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public void alterPassword(int password) {
		this.password=password;
	}

	public void alterUsername(String username) {
		this.username=username;
	}
	
	private ArrayList<EmployeeFile> employeelist =new ArrayList<>();
    private ArrayList<File> file =new ArrayList<>();
    static int i=0;


    void addEmployee(String name , int age , int workingHours,double salary) {
    	 try {
    		file.add(new File("employee"+ i + ".txt"));
    	    EmployeeFile a=new EmployeeFile(name,age,workingHours,salary);
    	    Writer fileWriter= new FileWriter("employee"+ i + ".txt");
    	    BufferedWriter pw= new BufferedWriter(fileWriter);
    	    employeelist.add(a);
	        pw.write("employee's name : " + name +"\r\n" + "employee's ID : "+ i+"\r\n" +"employee's age : " + age  +"\r\n"+ "your work hours : "+ workingHours + "\r\n" + "your salary is : " + salary + "\r\n");
	        pw.close();

	        i++;
	    }
    	catch(IOException e) {
    		System.err.println("error");
    	}
     }

    String listEmployee () {
    	 String s=" ";
    	 s+= "Employees : \n    Name \t\t\t ID \n\n";
  	     for(int i = 0 ; i<employeelist.size() ; i++) {
  		        EmployeeFile a= employeelist.get(i);
  		        s+= (i+1) + " - " + a.name + "\n";
  	     }
  		 return s;
    }

  void deleteEmployee(int id) {
    	try {
    	employeelist.remove(id);
    	File a = file.get(id);
    	a.delete();}
    	catch(IndexOutOfBoundsException e) {
    		System.err.println("can't do this operation");
    	} 
	  
	  void updateEmployee(int id,String name,int age, int workinghours,double salary) {
    	 try {
    		 File a=new File("employee"+ id + ".txt");
    	  Writer fileWriter= new FileWriter(a);
  	    BufferedWriter pw= new BufferedWriter(fileWriter);
  	    pw.write("employee's name : " + name +"\r\n" + "employee's ID : "+ i+"\r\n" +"employee's age : " + age  +"\r\n"+ "your work hours : "+ workinghours + "\r\n" + "your salary is : " + salary + "\r\n");
   	      file.set(id,a);
   	      pw.close();
   	      EmployeeFile b=new EmployeeFile(name,age,workinghours,salary);
   	      employeelist.set(id, b);
    	 }
    	  catch(IndexOutOfBoundsException e) {
    		  System.err.println("can't find the employee");
    	  } catch (IOException e) {
    		  System.err.println("can't do this operation");
		}
     }
}
