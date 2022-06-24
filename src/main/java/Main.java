import java.util.Scanner;
import java.util.Random;


public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int x = random.nextInt(10);
        int times = 0;
        System.out.println("Guess a number");
        int guess = scanner.nextInt();

        while (true) {
            if (guess < x) {
                times = times + 1;
                System.out.println("too small");
                guess = scanner.nextInt();

            } else if (guess > x) {
                times = times + 1;
                System.out.println("too big");
                guess = scanner.nextInt();

            } else {
                times = times + 1;
                System.out.println("correct guess");
                System.out.println("number of guesses: " + times);
                break;
            }

        }

    }

}
