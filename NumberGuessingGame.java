import java.util.Scanner;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        int attempts = 5;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + attempts + " attempts to guess a number between " + min + " and " + max + ".");

        for (int i = 1; i <= attempts; i++) 
        {
            System.out.print("Attempt " + i + ": ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) 
            {
                System.out.println("Congratulations! You guessed the number in " + i + " attempts.");
                return;
            } 
            else if (guess < randomNumber) 
            {
                System.out.println("The number is higher than " + guess + ".");
            } 
            else 
            {
                System.out.println("The number is lower than " + guess + ".");
            }
        }

        System.out.println("Sorry, you did not guess the number. The number was " + randomNumber + ".");
    }
}
