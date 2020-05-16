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

    String list () {
    	 String s=" ";
    	 s+= "Employees : \n    Name \t\t\t ID \n\n";
  	     for(int i = 0 ; i<employeelist.size() ; i++) {
  		        EmployeeFile a= employeelist.get(i);
  		        s+= (i+1) + " - " + a.name + "\n";
  	     }
  		 return s;
    }

  void delete(int id) {
    	try {
    	employeelist.remove(id);
    	File a = file.get(id);
    	a.delete();}
    	catch(IndexOutOfBoundsException e) {
    		System.err.println("can't do this operation");
    	} 
}
