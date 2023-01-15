package ctatgorya;

import java.util.Scanner;

public class Q1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Enter your first  number: ");
        num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        num2 = sc.nextInt();

        // Sum
        System.out.println(num1 +" + " + num2 + " = "+ (num1 + num2)  );

        //average
        System.out.println("Average of " + num1 + " & " + num2 + " = "+ (num1 + num2)/2);


    }



}
