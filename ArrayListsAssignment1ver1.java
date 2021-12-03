import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListsAssignment1ver1 {
    public static void main(String[] args) {
        // Making my "tools"
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> listOfPeople = new ArrayList<String>();
        System.out.println("Who do you want in your list of people?");
        boolean dirt = false;
        String keepGoing = "A";
        do{
            System.out.print("> ");
            listOfPeople.add(keyboard.next());
            System.out.print("Do you want to keep going? (Y/N)\n> ");
            keepGoing = keyboard.next();
            // Choices
            if (keepGoing.equalsIgnoreCase("Y")) {
                dirt = true;
                System.out.println("Go ahead.");
            } else if (keepGoing.equalsIgnoreCase("N")) {
                keyboard.close();
                System.out.println("Okay, your list is:");
                dirt = false;
            } else {
                System.out.println("That is not an answer.\nGive me another name.");
            }
        } while(dirt == true);
        Collections.sort(listOfPeople);
        System.out.println(listOfPeople);
    }
}
