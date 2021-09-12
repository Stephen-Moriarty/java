import java.util.Scanner;
public class madLibs {
    public static void main(String[] args){
        //⬇scanner
        Scanner keyboard = new Scanner(System.in);
        //⬆scanner
        
        System.out.println("Yo yo yo welcome to my Madlibs homie");
        System.out.println("Give me words for our test Madlibs sentence");
        System.out.println("Give me an adjective homie: ");
        //adjective = keyboard.nextLine();
        //takes in adjective fo first sentence:
        String adjective1 = keyboard.nextLine();
        System.out.println("Give me a noun breadslice: ");
        //takes in noun for first sentence:
        String noun1 = keyboard.nextLine();
        System.out.println("Give me a verb bro: ");
        //takes in verb for first sentence:
        String verb1 = keyboard.nextLine();
        System.out.println("Here if your sentence: ");
        System.out.println("The " + noun1 + " " + verb1 + " " + adjective1);
        //⬆ end of first sentence
        //
        //
        //Start of sencond sentence
        System.out.println("Yo now it is forizzle de shizzle Madlibs time");
        System.out.println("Give me new noun(s), verb(s), adjective(s) and name(s)");
        //
        System.out.print("I don'think I have a cool purpose for your name yet but might as well tell me it anyway incase I could think of *cooler* way to implement it later on>");
        String userName0 = keyboard.nextLine();
        //
        System.out.print("noun1>");
        noun1 = keyboard.nextLine();
        //
        System.out.print("verb1 like running or something> ");
        verb1 = keyboard.nextLine();
        //
        /*
        System.out.print("verb2 (without \"ing\")> ");
        String verb2 = keyboard.nextLine();
        */
        //
        System.out.print("adjective2> ");
        String adjective2 = keyboard.nextLine();
        //
        System.out.print("Noun2 preferably a place but it is fine if it isn't a place> ");
        String noun2 = keyboard.nextLine();
        //
        System.out.print("Give me a name of a place whether made up or real> ");
        String nameOfLand1 = keyboard.nextLine();
        //
        System.out.print("Give me another name> ");
        String villianName1 = keyboard.nextLine();
        //
        System.out.print("Give me another noun> ");
        String noun3 = keyboard.nextLine();
        //
        System.out.print("Give me yet another name> ");
        String heroBa = keyboard.nextLine();
        //
        System.out.print("Give me a verb (without \"ing\") and also preferably violent but like you can play the game however you want lol 👌> ");
        String verb3 = keyboard.nextLine();
        //spacer for between the word they put in and the actual madlibs sentence:
        System.out.println(" ");
        //spacer ⬆
        System.out.println("Your name was: " + userName0 + ", and the Mablibs you made was:");
        //The user's mablib:
        System.out.println("Once upon a time there was a(n) " + adjective1 + " " + noun1 + " they loved to " +  verb1 +  " in the " + adjective2 + " " + noun2 + ".");
        System.out.println("The " + noun1 + " lived in the land of " + nameOfLand1 + ".");
        System.out.println("One day the evil " + villianName1 + " came and " + verb3 + " the people into tiny little "  + noun3);
        System.out.println("But then " + heroBa + " came and killed the evil " + villianName1 + " and therefore saved the day.");
        System.out.println("Have a good day user: " + userName0);
        System.out.println("`THE PROGRAM HAS ENDED`");
        //
        /*
        System.out.print(verb1 + " by the " + noun2);
        System.out.print(" and " + verb2 + " in the " + noun1 + " " + adjective2 + " in a land called " + nameOfLand1);
        */

        //
        //And frolicked in the autumn mist in a land called Honah Lee
        //
        /*
        System.out.println("Give me an adjective breadslice");
        System.out.println(">");
        */
        
        


//Ignore this this is just the assignment prompt thingy:



         /*For this assignment, you will need to create a short Madlibs passage. A madlib is a word game which consists of one player prompting others for a list of words to substitute for blanks in a story before reading aloud.

You are creating a program that serves as a madlibs generator. You will write a short story, minimum of four sentences that will be interspersed with inputs from the user.

Assignment features:

Use of the scanner object
Use of string variables
Use of print statements
Use of comments to label sections of your code
Assignment requirements:

The madlibs story produced must be at least 4 sentences long.
You must have the user input at least 8 words. (These can be verbs, nouns, adjectives, etc.)
The story, outside of the random portions, should have some continuity. Don't write 4 unrelated sentences.
The user must input all their words before any portion of the story is presented to them.
Grading Notes:

You will be assessed on:
Completion of the above requirements
Your adherence to conventions/standards, such as:
Proper indentation
Good variable naming
such as userNoun1 versus a variable named a
following capitalization standards (camelCase)
Proper use of white space 
 

Stuck? Helpful hints:

The first thing you should do is set up the Scanner object:
Then, create String type variables to store the user input. Remember to give them relevant names.
Then, acquire the input from the user.
Do this as many times as needed
Then, print out the story, using the words provided by the user.
Remember to test your programs before submitting!!!

Programs that do not compile will receive a zero!
*/
//closes Scanner:
keyboard.close();
//closes Scanner "input" ^
    }
}
