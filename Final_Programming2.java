import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.*;

public class Final_Programming2 {
    //Base
    Random random = new Random();
    Scanner keyboard = new Scanner(System.in);
    
    int ifOver = 0;
    int userGuess = 0;
    
    int myLow = 0;
    int myHigh = 0;
    
    //Computer guessers
    int computer1 = 0;
    int computer2 = 0;
    int computer3 = 0;

    //Cost of item
    int itemPrice = 0;

    //
    ArrayList<Integer> myListOfWinners = new ArrayList<Integer>();
    int youAreWin = 0;

    //Prompt user
    System.out.println("Welcome to the Price is Right.\nUp for bid is a Gameboy coated in gold it is antique and has a wonderful selection of games.\nContestant #4, what's your bid?\n> ");
    
    itemPrice = 3000;

    do {
        System.out.println("\n>");
        userGuess = keyboard.nextInt();
        if (userGuess < 1) {
            System.out.println("'You naughty naughty, you teasing me ( ͡° ͜ʖ ͡°)'\nYour guess can't be less then 0.\nTry again buckaroo.");
        }
    } while (userGuess < 1);

    //Comp1 and 2 guess here
    computer1 = random.nextInt(2001) +1000; //2001 so the random can be 0-2k
    computer2 = random.nextInt(2000) +1;
    
    
    //Comp3 guess
    if ((computer1-500) > (usersGuess+1)) {
        myHigh = computer1 - 500;
        myLow = userGuess +1;
    } else {
        myHigh = userGuess +1;
        myLow = computer1 - 500;
    }

    computer3 = random.nextInt(high-myLow) + myLow;   
    
    //Print out Guesses
    System.out.println("The bids:\n\tPerson 1: " + computer1 + "\n\tPerson 2: " + computer2 + "\n\tPerson 3: " + computer3 + "\n\tPerson 4: " + userGuess);
    //
    System.out.println("The actual price was: " + itemPrice + ".");
    //Prints out the results
    System.out.println("\nThe Differences are: ");
    computer1 = 3000; computer2 = 3000; computer3 = 3000; usersGuess = 3000;
    // User
    if (usersGuess > itemPrice) {
        System.out.println("\tPerson 4: Over");
        ifOver++;
    } else {
        System.out.println("Person 4 : " + (itemPrice - userGuess));
        myListOfWinners.add(userGuess);
    }
    
    // Computer 1
    if (computer1 > itemPrice) {
        System.out.println("Person 1: OVER");
        ifOver++;
    } else {
        System.out.println("Person 1: " + (itemPrice - computer1)); 
        myListOfWinners.add(computer1);
        
    }

    // Computer 2
    if (computer2 > itemPrice) {
        System.out.println("Person 2: OVER");
        ifOver++;
    } else {
        System.out.println("Person 2: " + (itemPrice - computer2));
        myListOfWinners.add(computer2);
    }

    //Computer 3
    if (computer3 > itemPrice) {
        System.out.println("Person 3: OVER");
        ifOver++;
    } else {
         System.out.println("Person 3: " + (itemPrice - computer3));
         myListOfWinners.add(computer3);
    }

    // Determining the winner
    if (ifOver < 4) {
        Collections.sort(myListOfWinners);
    youAreWin = myListOfWinners.get(myListOfWinners.size()-1);
    }
    
    //Tells us who won or not 👌
    if (ifOver == 4) {
        System.out.println("I am sorry to say this but you have all lost. (;-;)");
    } else if (usersGuess == winner) {
        System.out.println("Hooray! Person 4 is the winner.");
    } else if (computer1 == winner) {
        System.out.println("Hooray! Person 1 is the winner.");
    } else if (computer2 == winner) {
        System.out.println("Hooray! Person 2 is the winner.");
    } else if (computer3 == winner) {
        System.out.println("Hooray! Person 3 is the winner.");
    }
    
    }
}
