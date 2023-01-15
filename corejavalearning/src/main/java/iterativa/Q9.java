package iterativa;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get its factorial : ");
        int num = sc.nextInt();
        int x = 1;

        for (int i = 1; i <= num; i++) {
            x = x * i;

        }
        System.out.println("factorial of " + num + " is " + x);
    }
}
