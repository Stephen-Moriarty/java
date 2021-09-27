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
        //I know you said use an int but since the my point system is so small I thought it would make more sense to use a byte type instead
        byte score = 0;
        System.out.println(now);
        System.out.println(day);
        System.out.println(now.getHour());
        byte userByte = 10;
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
        //first question
        //Multiple choice?
        System.out.println("Yo yo yo, are you ready to get schooled?");
        System.out.println("Hey hey what equation to get the 'inches' (from the corner to the other corner also known as the hypotonouse) of a TV:");
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
                
              break;

            case 'C':
                System.out.println("Dang you must really like speed");
                System.out.println("Please try again");
                System.out.println(" ");
               
              break;

            case 'D':
                System.out.println("Try again Einstein");
                //System.out.println(" ");
                System.out.println(" ");
                
              break;
            default:
            System.out.println("Sorry bro that is just plain wrong");
            System.out.println("Please try again");
            System.out.println(" ");
            //No punishment for this one or nay of them
            break;
        }
    }
            //Second question
            //Math question

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
                //System.out.println("Since you were so sccurate you get ! TWO points");
                
                score++;
                System.out.println("That is great but I asked for the nearest tenth");
                System.out.println("You get the point anyways because I respect presicion");
            }else if(userNum == 36.71){
                System.out.println("Nice buddy, good job");
                score++;
            }else if(userNum == 69){
                System.out.println("Nice try bro but no...");
            }else{
                System.out.println("Sorry buddy that is wrong.");
            }
            //A spacer thing:
            System.out.println("");

            //Third question
            //The time based one

            System.out.println("What is the hour (in military time) you ran this program times 7?");
            System.out.println("Rememeber that military time (For the hours atleast) starts at 0 and goes to 24 then repeats");
            userNum = keyboard.nextInt();
            if(userNum == (now.getHour() * 7)){
                System.out.println("Great job user");
                score++;
            }else{
                System.out.println("Sorry user but you got that wrong");

            }
            //Spacer:
            System.out.println("");
            // 4th question
            //make a Guess
            
            System.out.println("user I feel bad for doing this but I would like you to guess a random number >= 0 but <= 1");
            
            int ranNum = random.nextInt(2)+0;
            //System.out.println(ranNum);
            userByte = keyboard.nextByte();
            if(userByte == ranNum){
                System.out.println("Great you guessed correctly.");
                score++;
            }else{
                System.out.println("Incorrect");
            }
            System.out.println("");

           //question 5
            System.out.println("What is 9 + 10");
            userNum = keyboard.nextInt();
            if(userNum == 19){
                System.out.println("Great you know your arithmatic");
                score++;
            }else if(userNum == 21){
                System.out.println("Haha, very funny user, but no that is not the correct answer");
            }else{
                System.out.println("Sorry, incorrect");
            }
            //Spacer:
            System.out.println("");

           //Question 6

            System.out.println("What hour is it?");
            
            userNum = keyboard.nextInt();
            if(userNum == now.getHour()){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Sorry, incorrect");
            }

        //Also I tried being more formal with this one but like I really do like talking to my user like they are my breadslice, something about it is so comforting.

        //closes input
        keyboard.close();
            //The reason why there are so many different options here is because incase I want to modify this later on my free time to make it have more or less points or take points away from the user
        if(score == 0){
            System.out.println("Your score was " + score + "/6");
            System.out.println("That is unfortunate user.");
        }else if(score == 1){
            System.out.println("Your score was " + score + "/6");
            System.out.println("Well atleast you got something right I can repsect that.");
        }else if(score == 2){
            System.out.println("Your score was " + score + "/6");
            System.out.println("You're making progress buddy.");
        }else if(score == 3){
            System.out.println("Your score was " + score + "/6");
            System.out.println("Half is good.");
        }else if(score == 4){
            System.out.println("Your score was " + score + "/6");
            System.out.println("Nice nice.");
        }else if(score == 5){
            System.out.println("Your score was " + score + "/6");
            System.out.println("Ay, that's pretty good.");
        }else if(score == 6){
            System.out.println("Your score was " + score + "/6");
            System.out.println("Good job user.");
        }else if(score > 6){
            System.out.println("Amazing job user!");
        }else if(score < 0){
            System.out.println("Don't knwo what you were doing but okay then.");
        }else{
            System.out.println("Okay then, sus.");
        }
        
        
    }
}
