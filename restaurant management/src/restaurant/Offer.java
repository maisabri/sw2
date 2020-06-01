import java.util.Scanner;

/**
 *
 * @author DELL LAPTOP
 */
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
        newprice = oldprice - ( oldprice*disc/100 ) ;
        System.out.println( "the new price is :" + newprice ) ;
    }
}
