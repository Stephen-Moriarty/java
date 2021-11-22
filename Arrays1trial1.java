import java.util.*;
public class Arrays1trial1 {
    public static void main(String[] args) {
        // Don't forget to clean up your commenty mess Stephen
        // And also the bad variable names
        Scanner keyboard = new Scanner(System.in);
        // Shifting alphabet
        System.out.println("Before: ");
        // String[] smallAlph = {"a", "b", "c", "d", "e", "f"};
        char[] smallAlph = {'a', 'b', 'c', 'd', 'e', 'f'};
        System.out.println(Arrays.toString(smallAlph));
        System.out.print("How much do you want to shift the alphabet by?\n> ");
        int userShiftVal = keyboard.nextInt();
        //char temp[] = {'0', '3', '6'};
        // Reordering elements in an array (shifting)
        String[] colors = {"red", "green", "blue", "yellow"};
        // How much do we want to shift by?
        int shiftAmount = 1;
        // Create the new shifted array
        char[] newColors = new char[smallAlph.length];
        int offSet = 0;
        for(int i=0; i<smallAlph.length; i++) {
            offSet = i + userShiftVal;
            newColors[i] = smallAlph[offSet % smallAlph.length];
        }
        System.out.println("smallAlph is: " + Arrays.toString(smallAlph));
        System.out.println("newColors is: " + Arrays.toString(newColors));
        // End of shifting alphabet

        // -

        // Shifting user word
        System.out.print("Give me a word to encode\n> ");
        String userWord = keyboard.next();
        keyboard.close();
        System.out.println(userWord);
        // Non working attempt at the current moment:
        /*
        for (int i=0; i<5; i++) {
            userWord = 
        }
        */
        /*
        System.out.print("Before: ");
        System.out.println(userWord);
        // WIP       
        for(int i=0; i<userWord.length; i++) {
            offSet = i + shiftAmount;
            newColors[i] = userWord[offSet % userWord.length];
        }
        // WIP
        System.out.print("After: " + userWord);  
        */
    }
}
