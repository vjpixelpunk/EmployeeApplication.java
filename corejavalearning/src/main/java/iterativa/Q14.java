package iterativa;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        System.out.println("Sum of the series 1 + 1/2 + 1/3 + … + 1/n is: " + sum);
    }
}
