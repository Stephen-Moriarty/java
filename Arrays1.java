import java.util.*;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Shifting alphabet
        char[] alph = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("The Alphabet: " + Arrays.toString(alph));
        System.out.print("How much do you want to shift the alphabet by?\n> ");
        int userShiftVal = keyboard.nextInt();
        // Create the new shifted array
        char[] shiftedAlph = new char[alph.length];
        int offSet = 0;
        for(int i=0; i<alph.length; i++) {
            offSet = i + userShiftVal;
            shiftedAlph[i] = alph[offSet % (alph.length)];
        }
        // Print out finished shifted alphabet
        System.out.println("Shifted alphabet: " + Arrays.toString(shiftedAlph));
        // End of shifting alphabet

        //spacer for readability and sectioning

        // Shifting/encoding userWord section       
        System.out.print("Give me a word to encode\n> ");
        String userWord = keyboard.next();
        keyboard.close();
        char[] searcher = new char[userWord.length()];
        for (int i=0; i<userWord.length(); i++) {
            for (int j=0; j<alph.length; j++){
                searcher[i] = userWord.charAt(i);
                if (/*userWord.charAt(i)*/searcher[i] == alph[j]) {
                    System.out.println(shiftedAlph[j]);
            } 
          }
        }

    }
}
