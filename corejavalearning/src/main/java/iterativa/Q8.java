package iterativa;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int x = sc.nextInt();

        for(int i = 1; i <=10; i++){
            System.out.println(x + " * "+ i + " = "+ x*i);
        }
    }
}
