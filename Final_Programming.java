import java.util.Scanner;
import java.util.Random;

public class Final_Programming{
    
    public static void main(String[] args){
        int userGuess = 0;
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        //int ranNum = random.nextInt(1000)+300;
        
        int itemPrice = 0;
        boolean found = false;
        
        int low = 300;
        int high = 2701;
        int max = high+low;
        int finder = random.nextInt(high)+low;
        
        System.out.println("Start!");
        do {
            max = random.nextInt(high)+low;
            
            
            System.out.println("All good" + max);
            if (finder>max){
                System.out.println(finder + ">" + max);
                found = true;
            }
            

        }while(found != true);
        

        

        itemPrice = random.nextInt(high)+low;
        
        System.out.print("\nWelcome to the Price is Right.\nUp for bid is a Gameboy coated in gold it is antique and has a wonderful selection of games\nContestant #1, what's your bid?\n> ");
        userGuess = keyboard.nextInt();
        
        
        //int userGuessPlusOne = userGuess++;
        boolean lessThan0 = true;
        do {
            if (userGuess <= 0){
                System.out.println("Try again ");
                userGuess = keyboard.nextInt();
                lessThan0 = false;
            }else{
                System.out.println("Error");
            }
        } while(lessThan0 == true);
        keyboard.close();
            

            int cpu3Guess = random.nextInt(comp1()-500)+userGuess+1;

        System.out.println("The bids:\nPerson 1:" + comp1() + "\nPerson 2:" + comp2() + "\nPerson 3:" + cpu3Guess);

        
    }   
    /*
    public static void guess(int keyboard){

    }
    */
    public static int comp1(){
        Random random = new Random();
        int cpu1Guess = random.nextInt(2000)+1000;
        return cpu1Guess;
    }

    public static int comp2(){
        Random random = new Random();
        int cpu2Guess = random.nextInt(2000)+1;
        return cpu2Guess;
    }

}