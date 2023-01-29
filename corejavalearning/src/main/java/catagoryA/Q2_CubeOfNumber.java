package catagoryA;

import java.util.Scanner;

public class Q2_CubeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input num : ");
        int num = sc.nextInt();
        System.out.println("Cube of the given number is : " + (num * num * num));
    }

}
