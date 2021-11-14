/*
uses:
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
*/
import java.util.*;
public class SortingSelector3 {
    public static void main(String[] args){
        System.out.print("Welcome to the sorting selector.");
        System.out.println("You can: \nA.) Selection sort\nB.) Bubble Sort\nC.) No sorting");
        // Make random number maker
        Random random = new Random();
        // My array length
        int[] arr = new int[5];
        // Filling in the array with random numbers
        for (int i=0; i<arr.length; i++) {
            arr[i] = random.nextInt(50) + 1;
        }
        // Make Scanner
        Scanner keyboard = new Scanner(System.in);
        // Prompt user
        System.out.print("What would you like to do?> ");
        // Get the users first character
        char userChoice = keyboard.nextLine().toUpperCase().charAt(0);
        // Making the boolean for the loop
        boolean endLoop = true;
        // Making the loop
        do {
            // Making the choices
         switch (userChoice) {
        case 'A': 
            // Selection sort
            System.out.println("Here is the unsorted array: " + Arrays.toString(arr));
                for (int i=0; i<arr.length-1; i++) {
                    int min = arr[i];
                    int minIndex = i;
                    for (int j=0; j<i; j++) {
                        if (min > arr[j]) {
                            min = arr[j];
                            minIndex = j;
                        }
                    }
                    arr[minIndex] = arr[i];
                    arr[i] = min;
                }
            
            System.out.println("Here is the sorted array: " + Arrays.toString(arr));
            System.out.print("Go again, if not then choose 'C'> ");
            userChoice = keyboard.nextLine().toUpperCase().charAt(0);
            if (userChoice == 'C') {
                endLoop = false;
            }else{
                endLoop = true;
            }
            break;
        case 'B':
            // Bubble sort
            int swaps = 0;
            System.out.println("Here is the unsorted array: " + Arrays.toString(arr));
            for (int j=0; j<arr.length-1; j++) {
                for (int i=0; i<arr.length-1; i++) {
                    if (arr[i] > arr[i+1]) {
                        System.out.println("Array is: " + Arrays.toString(arr));
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        swaps++;
                    }
                }
            }
            System.out.println("Here is the sorted array: " + Arrays.toString(arr) + "\nThere were " + swaps + " swaps made.");
            System.out.print("Go again, if not then choose 'C'> ");
            userChoice = keyboard.nextLine().toUpperCase().charAt(0);
            if (userChoice == 'C') {
                endLoop = false;
            }else{
                endLoop = true;
            }
            break;
        case 'C':
            endLoop = false;
            System.out.println("Okay, thank you.");
            break;
        default:
            System.out.println("That is not an option please try again.> ");
            userChoice = keyboard.nextLine().toUpperCase().charAt(0);
            if (userChoice == 'C') {
                endLoop = false;
            }else{
                endLoop = true;
            }
            break;
            }
            break;
        } while (endLoop);
        keyboard.close();
    }
}
