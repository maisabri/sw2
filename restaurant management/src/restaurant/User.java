package restaurant;

public class User {

    public String username ;
    public String password ;

    public User (){

    }

    public User( String str1 , String str2 )
    {
        this.username = str1 ;
        this.password = str2 ;
    }

    public boolean login( String str1 , String str2 )
    {
         return str1.equals( this.username ) && str2.equals( this.password ) ;
    }

}
