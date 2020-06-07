import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author DELL LAPTOP
 */
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
