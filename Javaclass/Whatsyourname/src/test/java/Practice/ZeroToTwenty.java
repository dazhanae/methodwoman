package Practice;

import java.util.Scanner;

public class ZeroToTwenty {

    public static void main(String[] args) {

            int number;

            System.out.print("Please enter a number between 1 and 20: ");
        Scanner scan = new Scanner();
        number = scan.nextInt();

            while (number < 1 || number > 20) {
                System.out.print("No, between 1 and 20: ");
                number = scan.nextInt();
            }

            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                } else {
                    System.out.print(i + " ");
                }

        }
    }
}
