import java.util.*;
public class Arrays1trial2 {
    public static void main(String[] args) {
        // Don't forget to clean up your commenty mess Stephen
        // And also the bad variable names
        Scanner keyboard = new Scanner(System.in);
        // Shifting alphabet
        //System.out.println("Before: ");
        // String[] smallAlph = {"a", "b", "c", "d", "e", "f"};
        char[] Alph = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("The Alphabet: " + Arrays.toString(Alph));
        System.out.print("How much do you want to shift the alphabet by?\n> ");
        int userShiftVal = keyboard.nextInt();
        //char temp[] = {'0', '3', '6'};
        // How much do we want to shift by?
        // Create the new shifted array
        char[] shiftAlph = new char[Alph.length];
        int offSet = 0;
        for(int i=0; i<Alph.length; i++) {
            offSet = i + userShiftVal;
            shiftAlph[i] = Alph[offSet % Alph.length];
        }
        //System.out.println("smallAlph is: " + Arrays.toString(smallAlph));
        System.out.println("Shifted alphabet: " + Arrays.toString(shiftAlph));
        // End of shifting alphabet

        // -

        // Shifting user word
        /*
        char[] uWA = new char[30];
        for (int i=0; i<uWA.length; i++){
            userWord[i] = ;
        }
        */
        
        System.out.print("Give me a word to encode\n> ");
        String userWord = keyboard.next();
        
        /*
        char[] userChars = new char[20];
        for (int i=0; i<userChars.length; i++){
        do {
            System.out.println("Give me char> ");
            userChars[i] = keyboard.nextLine();
            System.out.println("Want end?> ");
            userWord = keyboard.next();
        } while (userWord != "7");
    }
        */
        for (int i=0; i<Alph.length; i++) {
            System.out.println("Inside first");
            for (int j=0; j<Alph.length; j++){
                System.out.println("Inside second");
                //Alph[i] = userWord.charAt(j);
            if (userWord.charAt(j) == Alph[i]) {
                System.out.println("Inside if");
                //System.out.println(Alph[]);
                System.out.println("Alph index is: " + Alph[i]);
                System.out.println("j is: " + j);
                System.out.println("i is: " + i);
                System.out.println("Userword at i is: " + userWord.charAt(i));
                // Switching the chars
                Alph[i] = userWord.charAt(j);
                System.out.println(userWord);
            }
            
          }
        }
        
        System.out.println(userWord);
        keyboard.close();
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
