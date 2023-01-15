package ifStatements;
import java.util.Scanner;
public class Q5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter third number: ");
            int num3 = sc.nextInt();
            int x = Math.max(num1, num2);
            System.out.println(Math.max(x, num3));
        }
    }


