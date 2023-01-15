package iterativa;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i = i + 2) {
            for (int j = 1; j <= i; j = j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }

    }
}
