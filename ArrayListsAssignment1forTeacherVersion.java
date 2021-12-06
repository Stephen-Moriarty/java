// This is supposed to be the cleaned up version of it for the actual teacher (not including this comment on line one becuase I added this after subbmitting it to the teacher)
import java.util.*;
public class ArrayListsAssignment1forTeacherVersion {
    public static void main(String[] args) {
        // Making my "tools"
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> listOfPeople = new ArrayList<String>();
        // Query the user
        System.out.println("Who do you want in your list of people?");
        // For whether user is still adding names
        boolean addingNames = false;
        // Important for the user input
        char keepGoing = 'A';
        do{
            System.out.print("> ");
            listOfPeople.add(keyboard.next());
            System.out.print("Do you want to keep going? (Y/N)\n> ");
            keepGoing = keyboard.next().toUpperCase().charAt(0);
            // Choices
            if (keepGoing == 'Y') {
                addingNames = true;
                System.out.println("Go ahead.");
            } else if (keepGoing == 'N') {
                keyboard.close();
                System.out.println("Okay, your list is:");
                addingNames = false;
            } else {
                System.out.println("That is not an answer.\nGive me another name.");
            }
        } while(addingNames);
        // Sorts the Strings
        Collections.sort(listOfPeople);
        // Prints out the sorted results
        System.out.println(listOfPeople);
    }
}
