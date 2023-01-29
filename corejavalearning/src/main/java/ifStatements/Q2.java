package ifStatements;

import java.util.Scanner;

public class Q2 {
    //Write a program to accept the bill amount and age of the customer;
    // if the customer’s age is >50 years then give a discount of 5% on the bill.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter your age: ");
        double age = sc.nextDouble();
        double percentage = (5 * 100) / amount;

        if (age >= 50) {
            System.out.println("amount to pay: " + (amount - percentage));
        } else
            System.out.println("amount to pay : " + amount);


    }
}
