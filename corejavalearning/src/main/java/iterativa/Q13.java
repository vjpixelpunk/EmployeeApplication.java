package iterativa;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;

      while(count < num){
          System.out.print(a + " ");
          int c = b + a;
          a = b;
          b = c;
          count = count + 1;
      }
    }
}
