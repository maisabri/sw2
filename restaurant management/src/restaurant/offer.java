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
