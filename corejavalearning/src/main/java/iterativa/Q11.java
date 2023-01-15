package iterativa;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
            count += i;

        }
        System.out.println("total = " + count);
    }

}
