/*
uses:
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
*/
import java.util.*;
public class SortingSelector {
    public static void main(String[] args){
        System.out.print("Welcome to the sorting selector.");
        System.out.println("You can: \nA.) Bubble Sort\nB.) Selection sort\nC.) Insertion Sort\nD.) No sorting");
        // Make random number
        Random random = new Random();
        int rand = random.nextInt(5)+1;
        // My array length
        int[] arr = new int[5];
        // Filling in the array with random numbers
        for (int i=0; i<arr.length; i++) {
            arr[i] = random.nextInt(50) + 1;
        }
        // Printing it for testing
        // System.out.println(Arrays.toString(arr));

        // Make Scanner
        // Choices
        char A = 'A';
        char B = 'B';
        char C = 'C';
        char D = 'D';
        //
        //char userChoice = 't';
        Scanner keyboard = new Scanner(System.in);
        do{
        System.out.print("What would you like to do?> ");
        char userChoice = keyboard.nextLine().toUpperCase().charAt(0);
        System.out.println("Their choice was: " + userChoice);
        
        
        if (userChoice == A) {
            System.out.println("You have chosen 'A'");
            System.out.println("Here is the unsorted array: " + Arrays.toString(arr));
            //
            //
            System.out.println("Here is the sorted array: " + Arrays.toString(arr));
        } else{
            System.out.println("That is not an option please try again.");

        }
        if (userChoice == B) {
            System.out.println("You have chosen 'B'");
            System.out.println("Here is the unsorted array: " + Arrays.toString(arr));
            //
            //
            System.out.println("Here is the sorted array: " + Arrays.toString(arr));
        } else {
            System.out.println("Ay, that is that an option buddy. Please choose a different one.");
        
        }
    } while (userChoice != D);
        //int[] arr = {5,4,6,8,3};
        for (int i=0; i>arr.length; i++){
        }
        //if ()
        /*
        for (int i=0; i<arr.length-1; i++) {
            for (int j=0; j<arr.length; j++) {
                if (false) {
                    System.out.println("Is false");
                } else {
                    System.out.println("Is true");
                } 
            }  
        }
*/
        System.out.println("Your sorted array is " + Arrays.toString(arr));
        keyboard.close();
    }
}
