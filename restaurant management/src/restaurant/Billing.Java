/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restauranttt;

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
