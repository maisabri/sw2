package restaurant;
public class Customer{
     String name;
    
      int id=1;
      public Customer(){
      }
      
      public Customer(String name){
          this.name=name;
      }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

       @Override
     public String toString(){
        return name+"\t\t";
    }
   
    
}
