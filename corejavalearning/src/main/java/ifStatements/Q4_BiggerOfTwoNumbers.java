package ifStatements;

import java.util.Scanner;

public class Q4_BiggerOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();


        System.out.println(Math.max(num1, num2));


    }


}
