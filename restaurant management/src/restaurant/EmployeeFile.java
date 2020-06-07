public class EmployeeFile {
    
	 String name ;
	 int id ;
	 int age ;
	 int workingHours ;
	 double salary;
        
        public EmployeeFile(){
            this.name="";
            this.workingHours=0;
            this.age=0;
            this.salary=0;
            
        }
	
	public int getId() {
		return this.id;
	}

    public void setId(int id) {
		this.id = id;
	}

	public EmployeeFile(String name, int age, int workingHours, double salary) {
		this.name=name;
		this.workingHours=workingHours;
		this.age=age;
		this.salary=salary;
	}
