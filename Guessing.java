import java.util.Scanner;
import java.util.Random;
// I try to only import what I need
public class Guessing {
    public static void main(String[] args){
        // Making the random and scanner
        Random r = new Random();
        Scanner k = new Scanner(System.in);
        //end
        // System.out.println("Yeet");
        // Variables
        int lives = 4;
        int counter = 0;
        int lowRange = 0;
        int highRange = 1000;
        int randomNum = r.nextInt(2)+0;
        boolean on = true;
        int userGuess = 0;
        

        System.out.println("Here are the rules: So you have 4 lives everytime you guess wrong");
        System.out.println(randomNum);
        do {
            System.out.println("Guess a number: ");
            userGuess = k.nextInt();
            counter++;
        } while (counter == 0);
        System.out.println("Post loop print statment");
        k.close();
    }
}
