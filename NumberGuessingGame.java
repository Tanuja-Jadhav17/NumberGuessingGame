import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random rand=new Random();
        String playAgain;

        do{

            int numberToGuess=rand.nextInt(100)+1;
            int maxAttempts=5;
            int guess;
            int attempts=0;
            boolean hasWon = false;
         
            System.out.println("Welcome To The Number Guessing Game!");
            System.out.println("Guess a number between 1 and 100: ");

            while( attempts < maxAttempts){
            
                System.out.println("Enter your guess: ");

               if(!scanner.hasNextInt()){

                   System.out.println("please enter a valid integer: ");
                   scanner.next();
                   continue;
            }

            guess=scanner.nextInt();
            attempts++;

            if(guess < 1 || guess > 100){
                System.out.println("please enter a number between 1 and 100: ");
                continue;
            }

            if(guess==numberToGuess){
                System.out.println("congratulations!you guessed the number" + attempts +" attempts ");
                break;
            }else if(guess<numberToGuess){
                System.out.println("Your guess is less than the number.Try again: ");
            }else{
                System.out.println("your guess is greater than the number.Try again: ");
            }
            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }
           if(!hasWon){
               System.out.println("sorry! The correct number was " + numberToGuess);
           }
           System.out.println("Play again? (yes/no): ");
           scanner.nextLine();
           playAgain=scanner.nextLine().toLowerCase();
    }while( playAgain.equals("yes") || playAgain.equals("y"));
    
    System.out.println("Thanks for playing!");
    scanner.close();
  }
}