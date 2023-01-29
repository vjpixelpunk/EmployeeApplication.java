package catagoryA;

import java.util.Scanner;

public class Q5_NetweightAndAverageWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first person weight : ");
        double person1 = sc.nextDouble();
        System.out.print("Enter second person weight : ");
        double person2 = sc.nextDouble();
        System.out.print("Enter third person weight : ");
        double person3 = sc.nextDouble();
        System.out.print("Enter forth person weight : ");
        double person4 = sc.nextDouble();
        System.out.print("Enter fifth person weight : ");
        double person5 = sc.nextDouble();


        double sum = person1+person2+person3+person4+person5;
        System.out.println("Average weight of all 5 people is : "+ sum/5);

    }


}
