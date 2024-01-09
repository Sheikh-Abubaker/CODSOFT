import java.util.Random;
import java.util.Scanner;

public class GuessNumber{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rand =  new Random();

        System.out.println("Welcome to Number Game!!!");

        while (true){

            int randNum = rand.nextInt(101);
            int attempts = 0;
            int maxAttempts = 3;
            int score = 0;

            while (attempts<maxAttempts) {

                System.out.println("Guess the numbers:");
                int userGuess = sc.nextInt();

                if (userGuess == randNum){
                    System.out.println("Congratulations!! your guess" + " " + randNum + " " + "is correct");
                    score++;
                }

                else if (userGuess > randNum){
                    System.out.println("Sorry your is guess is too high, try again");
                }

                else if (userGuess < randNum){
                    System.out.println("Sorry your is guess is too low, try again");
                }

                attempts++;

            }

            if (attempts == maxAttempts){
                System.out.println("You've reached the max attempts!! \nYour score for this round is:" + " " + score + " " + "\nThe generated number was:"+" "+randNum+" ");
            }
            
            System.out.println("Do you want to play again ? (yes/no): ");
            String choice = sc.next().toLowerCase();

            if(!choice.equals("yes")){

                System.out.println("Thanks for playing!!");
                break;

            }

        }

    }
    
}