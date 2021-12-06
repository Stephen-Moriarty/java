// I was going to import what I needed individually but I never got an email back as to what was more efficent and which was less bloated so I am just going to import ALL because that is how we do it in class and the teacher emphasized consistancy so ***whatever***
import java.util.*;
public class ArrayListsAssignment1 {
    public static void main(String[] args) {
        // Making my "tools"
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> listOfPeople = new ArrayList<String>();
        // Asking the user a question so that they know what they are answering to
        System.out.println("Who do you want in your list of people?");
        // I set the boolean to false so it is a "guilty until proven otherwise" kind of thing
        boolean addingNames = false;
        // This String holds the user input for whether or not the loop keeps going 
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
            // I LEGITIMENTLY wasn't sure what way to make the condition for the while loop the most efficent compared to what was more reliable so I tried ot "while(addingNames)" and "while(addingNames == true)" and they both worked so I am assuming that the "== true" onr is technichally cluckier but I still feel like it might be maybe more robust so I went with it (for now).
        } while(addingNames == true);
        // Sorts the Strings
        Collections.sort(listOfPeople);
        // Prints out the sorted results
        System.out.println(listOfPeople);
    }
}
