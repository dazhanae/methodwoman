import java.util.Random;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random num = new Random();
        int randomnum1 = num.nextInt(10);


        System.out.println("Guess a number between 1-10");
        while (true) {
            int mynum = scan.nextInt();

            if (mynum == randomnum1) {
                System.out.println(("You win!"));
                break;

            } else if (mynum > randomnum1) {
                System.out.println("you are too high!");
            } else
                System.out.println("You are too low");


        }
    }
}
