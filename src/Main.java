import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(1001);
        int tryCount = 0;

        while (true) {
            try {
                System.out.println("Enter your guess between 1 and 1000");
                Scanner sc = new Scanner(System.in);
                int guess = Integer.parseInt(sc.nextLine());
                tryCount++;
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number " + randomNumber + ".");
                    System.out.println("It took you " + tryCount + " times.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Sorry,the number is higher.Guess again");
                } else {
                    System.out.println("Sorry,the number is lower.Guess again");
                }

            } catch (NumberFormatException e) {
                System.out.println("Sorry,the number is outside the interval.Guess again");
            }

        }
    }
}