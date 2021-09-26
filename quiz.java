import java.util.Scanner;
import java.util.Random;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
public class quiz {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek day = now.getDayOfWeek();
        double userNum = 0.0;
        char userAnswer = 'Z';
        byte score = 0;
        System.out.println(now);
        System.out.println(day);
//not relevant:
        /*
        int x = 5;
        int y = 8;
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y + " " + temp);
        */
        //Not important for this ^
        //Scanner, random number, and time stuff
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        
        //
        /*
        int a = random.nextInt(25) + 1;
       
        if(a%5 == 0){
            System.out.println("Divisible by five. Cool");
        }else{
            if (a % 2 ==0){
                System.out.println(a + " Even");
            }else{
                System.out.println(a + " Odd");
            }
        }
        */

        
        //int score = 0;
        System.out.println("Yo yo yo, are you ready to get schooled?");
        System.out.println("Hey hey what equation to get the 'inches' of a TV:");
        while (userAnswer != 'A'){
        //System.out.println("");
        System.out.println("A: A^2 + B^2 = C^2");
        System.out.println("B: y=mx+b");
        System.out.println("C: v=d/t");
        System.out.println("D: E=mc^2");
        System.out.print("Put your answer here either A,B,C,D:");
        
        userAnswer = keyboard.next().toUpperCase().charAt(0);
        switch (userAnswer) {
            case 'A':
                System.out.println("Correct");
                score++;
            break;

            case 'B':
                System.out.println("Sorry bro that is for finding stuff about linear lines");
                System.out.println("Please try again");
                System.out.println(" ");
                score--;
              break;

            case 'C':
                System.out.println("Dang you must really like speed");
                System.out.println("Please try again");
                System.out.println(" ");
                score--;
              break;

            case 'D':
                System.out.println("Try again Einstein");
                //System.out.println(" ");
                System.out.println(" ");
                score--;
              break;
            default:
            System.out.println("Sorry bro that is just plain wrong");
            System.out.println("Please try again");
            System.out.println(" ");
            //No punishment for this one
            break;
        }
    }
            //Next question

            double a = 32.0;
            double b = 18.0;
            double aSquared = (a*a);
            double bSquared = (b*b);
            //System.out.println(a*a);
            //System.out.println(b*b);
            //System.out.println(a);
            //System.out.println(b);
            double cSquared = (aSquared + bSquared);   
            double c = Math.sqrt(cSquared);
            //System.out.println(c);
            
            System.out.println("Great you got through that question now next question");
            System.out.println(" ");
            System.out.println("If you have a TV that has a width of 32 inches and a height of 18 iches what is the hypotonouse rouded to the nearest tenth>");
            userNum = keyboard.nextDouble();
            // Answer should be 36.71511950137164
            if (userNum == c){
                //System.out.println("Since you were so sccurate you get TWO points");
                score++;
                score++;
                System.out.println("That is great but I asked for the nearest tenth");
            }else if(userNum == 36.71){
                System.out.println("Nice buddy good job");
                score++;
            }else if(userNum == 69){
                System.out.println("Nice try bro but no...");
            }else{
                System.out.println("Sorry buddy that is wrong.");
            }
            /*
            switch (userAnswer){
            case 'A':

            System.out.println("");
            break;
            case 'B':

            System.out.println("");
            break;
            case 'C':

            System.out.println("");
            break;
            case 'D':
            System.out.println("");

            break;
            default:
            
            break;
            }
            */









    
        
        /*
        DayOfWeek today = now.getDayOfWeek();
        boolean includesTuesday = today == DayOfWeek.TUESDAY || today == DayOfWeek.MONDAY || today == DayOfWeek.SUNDAY;
        int numApplesRemaining;
        if(includesTuesday){
            numApplesRemaining = 3;
        }else{
            numApplesRemaining = 4;
        }
        System.out.println(numApplesRemaining);
        int userGuess = keyboard.nextInt();
        if(userGuess == numApplesRemaining){
            score++;
        }else{
            System.out.println("Go back to math class.");
        }
        */
        // Question 2
        /*
        System.out.print("\nThis class is called\n\tA.) Computer Scinece\n\tB.) Band\n\tC.) Nap time\n\tD.) English\nYour response: ");
        */
        //
        //You put input Scanner here
        
        //
        /*
        switch (userAnswer) {
            case 'A':
                //score
                break;
            default:
                System.out.println(".....no.");
        }

        // Output
        System.out.println("You got score" + score + " out of 6");
        if (score < 4){
            System.out.println("That's not great.");
        } else if (score == 4) {
            System.out.println("Interesting");
        } else if(score == 5){
            System.out.println("Whoops");
        } else {
            System.out.println("If score > 5 then: GREAT \n if score < 5: big sad yo");
        }
        */
        /*Assignment description

        For this assignment, you will make a small trivia quiz. You may write whatever questions you want as long as the program requirements/features are met.

For this task you will create a program that contains and utilizes the following features:

user input
output
arithmetic operations
contains comments
conditional statements
For this task you will create a program that asks the user a series of questions and requires them to respond with the correct answer. After all questions have been answered a score will be given.

Program Requirements/Features:

Program should start by displaying the date and time
Provides the user with at least 6 questions
At least one of the questions must be evaluated with a switch-case and contain unique responses for each option
At least one of the questions must incorporate data from the LocalDateTime class
At least one of the questions must have numerical input
At least one of the questions must be multiple choice
At least one of the questions must involve a random number
Feedback must be given after each question regarding whether it was correct or not.
A score is kept throughout the program using an integer value
At the end of the program, give the user feedback based on their score.
Proper indentation and nesting is used
The program/user interface may be laid out in any manner you choose so long as:

it is clean and easy to follow
line breaks/indentation are used in a logical manner
Reminder that programs that do not compile will receive a zero!
Test your programs!!!

        */
        System.out.println("Your score is now " + score);
        keyboard.close();
    }
}
