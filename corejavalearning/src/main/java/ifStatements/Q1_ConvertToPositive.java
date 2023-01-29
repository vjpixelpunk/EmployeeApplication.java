package ifStatements;

import java.util.Scanner;

public class Q1_ConvertToPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(Math.abs(num));
        } else
            System.out.println(num);
    }
}
