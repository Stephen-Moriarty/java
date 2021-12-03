import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListsAssignment1ver2 {
    public static void main(String[] args) {
        // Making my "tools"
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> listOfPeople = new ArrayList<String>();
        // Asking the user a question so that they know what they are aswering to
        System.out.println("Who do you want in your list of people?");
        // I set the boolean to false so it is a "guilty until proven otherwise" kind of thing
        boolean dirt = false;
        // This String holds the user input for whether or not the loop keeps going 
        char keepGoing = 'A';
        do{
            System.out.print("> ");
            listOfPeople.add(keyboard.next());
            System.out.print("Do you want to keep going? (Y/N)\n> ");
            keepGoing = keyboard.next().charAt(0);
            // Choices
            if (keepGoing == 'Y') {
                dirt = true;
                System.out.println("Go ahead.");
            } else if (keepGoing == 'N') {
                keyboard.close();
                System.out.println("Okay, your list is:");
                dirt = false;
            } else {
                System.out.println("That is not an answer.\nGive me another name.");
            }
        } while(dirt == true);
        // Sorts the Strings
        Collections.sort(listOfPeople);
        // Prints out the sorted results
        System.out.println(listOfPeople);
    }
}
