import java.util.Scanner;
import java.util.Random;
// I try to only import what I need
public class Guessing {
    public static void main(String[] args){
        // Making the random and scanner
        Random r = new Random();
        Scanner k = new Scanner(System.in);
        // Variables
        int lives = 5;
        int counter = 0;
        //int lowRange = 0;
        //int highRange = 100;
        int randomNum = r.nextInt(100);
        boolean on = true;
        int userGuess = 0;
        //Start of outputs and inputs
        System.out.println("Here are the rules: So you have 4 lives\nEverytime you guess wrong you get a life taken away\nYou have to guess a number between 1 and 100");
        System.out.println(randomNum);

        do {
            System.out.println("Guess a number: ");
            userGuess = k.nextInt();
            if (userGuess == randomNum){
                System.out.println("Yay! You got it correct.");
                
            }else{
                System.out.println("Sorry that is wrong please try again.");
                counter++;
                lives--;
            }
            counter++;
        } while (counter == 0);
        System.out.println("Post loop print statment");
        k.close();
    }
}
