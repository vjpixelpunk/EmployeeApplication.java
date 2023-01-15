package iterativa;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;
        int sum = 0;

        while(count < num){
            System.out.print(a + " ");

            int c = b + a;
            sum = sum + b;
            a = b;
            b = c;
            count = count + 1;


        }
        System.out.print("Sum = "+sum);
    }
}
