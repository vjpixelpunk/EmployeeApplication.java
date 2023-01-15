package ctatgorya;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int numx = 0;
        numx = num1;
        num1 = num2;
        num2 = numx;
        System.out.println("first number : " + num1);
        System.out.println("second number : " + num2);


    }
}
