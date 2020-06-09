package restaurant;
import java.util.Scanner;
public class Offer {

    double oldprice ;
    double disc ;
    double newprice ;

    public void discount()
    {
        Scanner read = new Scanner(System.in) ;
        System.out.println("enter the discount percentage : ") ;
        disc = read.nextDouble() ;
        read.close();
    }

        public void newprice()
    {
    	Scanner read = new Scanner(System.in) ;
        System.out.println("enter price before discount : ") ;
        oldprice = read.nextDouble() ;
        read.close();
        newprice = oldprice - ( oldprice*disc/100 ) ;
        System.out.println( "the new price is :" + newprice ) ;
    }
}

