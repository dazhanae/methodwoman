package QualityLoaner;

import java.util.Scanner;


public class GetMoney {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many pennies do you want?");
        int  pennies = scan.nextInt();
        System.out.println("How many quarters do you want?");
        int quarters = scan.nextInt();
        System.out.println("How many dimes?");
        int dimes = scan.nextInt();
        System.out.println("How many nickles do you want?");
        int nickles = scan.nextInt();
        double total = ((pennies * 0.01)+ (nickles * .05) +  (dimes * .1) + (quarters * .25));
        if (total == 1.00) {
            System.out.println("Yay, you win");
        } else if (total < 1.00) {
            System.out.println((1.00 - total ) + " you are under the expected amount");
        } else if (total > 1.00) {
            System.out.println((total - 1.00 ) + " you are over expected amount");
        }

}
}
