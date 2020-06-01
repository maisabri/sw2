 void update(int ID_Customer,String Name_Customer) {
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
