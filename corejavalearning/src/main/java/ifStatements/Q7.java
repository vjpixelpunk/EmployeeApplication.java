package ifStatements;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter : ");
        String x = sc.nextLine();
        //System.out.println(x.hashCode());

        if(x.hashCode() >= 65 && x.hashCode() <= 90 ){
            System.out.println("Capital letter");
        }
        else if (x.hashCode() >= 97 && x.hashCode() <= 122){
            System.out.println("Small letter");
        }
        else if ((x.hashCode() >= 33 && x.hashCode() <= 47) || (x.hashCode() >= 58 && x.hashCode() <= 64) || (x.hashCode() >= 91 && x.hashCode() <= 96) || (x.hashCode() >= 123 && x.hashCode() <= 126)){
            System.out.println("Special character");
        }else if ((x.hashCode() >= 48 && x.hashCode() <= 57)){
            System.out.println("Numerical");
        }else if (x.hashCode() == 32){
            System.out.println("Space");
        }else
            System.out.println("unknown");


    }
}
