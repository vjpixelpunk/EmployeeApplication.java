package ifStatements;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else if (num % 2 != 0) System.out.println(num + " is an odd number.");
        else {
            System.out.println(num);
        }
    }
}
