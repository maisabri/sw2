package restaurant;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Billing {
     Scanner scan =new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0");
    double mealCost;
    double tax;
    double tip;
    double totalCost;
    double totalBill;

    public double getMealCost() {
        return mealCost;
    }

    public void setMealCost(double mealCost) {
        this.mealCost = mealCost;
    }

         public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
    
     public double tax(){
            tax = 0.067 * mealCost;
            return tax;
     }
     
      public double tip(){
        totalCost = mealCost + tax;
        tip= 0.2 * totalCost;
            return tip;
      }
    
       public double totalBill(){
        totalBill = totalCost + tip;
            return totalBill;
    }
     
}
