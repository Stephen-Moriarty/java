import java.util.Scanner;
import java.util.Random;

public class Final_Programming1{
    
    public static void main(String[] args){
        
        int userGuess = 0;
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        //int ranNum = random.nextInt(1000)+300;
        
        int itemPrice = 0;
        boolean found = false;

        boolean lost1 = false;
        boolean lost2 = false;
        boolean lost3 = false;
        boolean lost4 = false;
        
        int low = 300;
        int high = 2701;
        int max = high+low;
        int finder = random.nextInt(high)+low;
        
        /*
        System.out.println("Start!");
        do {
            max = random.nextInt(high)+low;
            
            
            System.out.println("All good" + max);
            if (finder>max){
                System.out.println(finder + ">" + max);
                found = true;
            }
            

        }while(found != true);
        */
        

        

        itemPrice = random.nextInt(high)+low;
        
        System.out.print("\nWelcome to the Price is Right.\nUp for bid is a Gameboy coated in gold it is antique and has a wonderful selection of games.\nContestant #4, what's your bid?\n> ");
        userGuess = keyboard.nextInt();
        
//         List all of the submitted bids and who submitted them
//         You should display the actual price of the item.
//         Display the difference between the submitted bids and the actual price
//         If that contestant picked over the price, this should display "Over" instead of a numerical value
//         Name the winner
//         If everyone guessed over, a message should be displayed expressing disappointment at the contestants.
        
        //int userGuessPlusOne = userGuess++;
        boolean lessThan0 = false;
        do {
            if (userGuess <= 0){
                System.out.println("Try again ");
                userGuess = keyboard.nextInt();
                lessThan0 = true;
            }else{
                lessThan0 = false;
            }
        } while(lessThan0 == true);
        keyboard.close();
            
        //Computer 1 and 2 were made using methods
        //Computer 3 was made as so
        int cpu3Guess = random.nextInt(comp1()-500)+userGuess+1;

        System.out.println("The bids:\n\tPerson 1: " + comp1() + "\n\tPerson 2: " + comp2() + "\n\tPerson 3: " + cpu3Guess + "\n\tPerson 4: " + userGuess);

        System.out.println("The actual number was: " + itemPrice + ".");

        //

        System.out.println("\nThe results:");
        if(comp1() > itemPrice){
            System.out.println("\tPerson 1: Over");
            lost1 = true;
        }else{
            System.out.println("\tPerson 1: $" + Math.abs(comp1() - itemPrice));
        }

        if(comp2() > itemPrice){
            System.out.println("\tPerson 2: Over");
            lost2 = true;
        }else{
            System.out.println("\tPerson 2: $" + Math.abs(comp2() - itemPrice));
        }

        if(cpu3Guess > itemPrice){
            System.out.println("\tPerson 3: Over");
            lost3 = true;
        }else{
            System.out.println("\tPerson 3 : $" + Math.abs(cpu3Guess - itemPrice));
        }

        if(userGuess > itemPrice){
            System.out.println("\tPerson 4: Over");
            lost4 = true;
        }else{
            System.out.println("\tPerson 4: $" + Math.abs(userGuess - itemPrice));
        }
        

        //
        boolean winner1 = false;
        boolean winner2 = false;
        boolean winner3 = false;
        boolean winner4 = false;

        //if(winner1 == false & winner2 == false & winner3 == false & winner4 == false){
            //System.out.println("Sorry, but you all lost.");
        //}else{

            if(lost4 != true){
                if(userGuess > (comp1() & comp2() & cpu3Guess)){
                    System.out.println("The winner is person 4.");
                    winner1 = true;
                }
            }

            if(lost3 != true){
                if(cpu3Guess > (comp1() & comp2() & userGuess)){
                    System.out.println("The winner is person 3.");
                    winner2 = true;
                }
            }

            if(lost2 != true){
                if(comp2() > (comp1() & userGuess & cpu3Guess)){
                    System.out.println("The winner is person 2.");
                    winner3 = true;
                }
            }

            if(lost1 != true){
                if(comp1() > (userGuess & comp2() & cpu3Guess)){
                    System.out.println("The winner is person 1.");
                    winner4 = true;
                }
            }
        //}
        
    }   
    
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