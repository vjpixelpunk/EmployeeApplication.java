package iterativa;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int even = 0;
        int odd = 0;

        for (int i = 0; i <= num; i++) {

            if (i % 2 == 0) {
        even +=i;

            } else
                odd += i;
        }
        System.out.println("even numbers are :"+ even);
        System.out.println("odd numbers are :"+ odd);


    }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        int evenSum = 0;
//        int oddSum = 0;
//        for (int i = 0; i <= num; i++) {
//            if (i % 2 == 0) {
//                evenSum += i;
//            } else {
//                oddSum += i;
//            }
//        }
//        System.out.println("Sum of even numbers from 0 to " + num + " is: " + evenSum);
//        System.out.println("Sum of odd numbers from 0 to " + num + " is: " + oddSum);
//    }
}


