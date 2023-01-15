package ifStatements;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost price : ");
        int cost = sc.nextInt();
        System.out.print("Enter selling price : ");
        int selling = sc.nextInt();

        if(cost < selling){
            System.out.println("Profit of : "+ ( selling - cost));
        }
        else if(cost > selling){
            System.out.println("Loss of "+ (cost - selling));

        }else
            System.out.println("No Profit or Loss");
    }
}
