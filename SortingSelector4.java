import java.util.*;
public class SortingSelector4 {
    public static void main(String[] args){
        System.out.println("Welcome to the sorting selector.\nYou can: \nA.) Selection sort\nB.) Bubble Sort\nC.) No sorting");
        // Make random number maker                                                                                                                                           
        Random random = new Random();
        // Make Scanner
        Scanner keyboard = new Scanner(System.in);
        // Prompt user
        System.out.print("What would you like to do?> ");
        // Get the users first character
        char userChoice = keyboard.nextLine().toUpperCase().charAt(0);
        // Making the boolean for the loop
        boolean stillPicking = true;
        // Making the loop
        do {
            // The random array generator needs to be inside of the do loop or else it literally just doesn't create a new random array. I figured that out the hard way. -_-
            // My array length
        int[] arr = new int[5];
        // Filling in the array with random numbers
        for (int i=0; i<arr.length; i++) {
            arr[i] = random.nextInt(50) + 1;
        }
            // The choices
         switch (userChoice) {
        case 'A':
            // Selection sort
            System.out.println("Here is the unsorted array: " + Arrays.toString(arr));
                int swaps = 0;
                    for(int i=0; i<arr.length; i++) {
                        int min = arr[i];
                        int minIndex = i;
                            for ( int j=i; j<arr.length; j++) {
                                if (min > arr[j]) {
                                    min = arr[j];
                                    minIndex = j;
                                    swaps++;
                                }
                            }
                            arr[minIndex] = arr[i];
                            arr[i] = min;
                            System.out.println(Arrays.toString(arr) + " " + arr[i] + " was swapped with " + arr[minIndex] );
                        }
            System.out.println("Here is the sorted array: " + Arrays.toString(arr) + "\nThere were " + swaps + " swaps made.");
            System.out.print("Thank you for selection sorting.\n\nGo again, if you don't want to then choose 'C'> ");
            userChoice = keyboard.nextLine().toUpperCase().charAt(0);
            if (userChoice != 'C') {
                stillPicking = true;
            }else{
                stillPicking = false;
            }
            break;
        case 'B' :
            // Bubble sort
            System.out.println("Here is the unsorted array: " + Arrays.toString(arr));
                swaps = 0;
                int swapped1 = 0;
               for (int j=0; j<arr.length-1; j++) {
                   for (int i=0; i<arr.length-1; i++) {
                       if (arr[i] > arr[i+1]) {
                           System.out.print(Arrays.toString(arr) + " ");
                           int temp = arr[i];
                           arr[i] = arr[i+1];
                           arr[i+1] = temp;
                           swapped1 = i+1;
                           swaps++;
                           System.out.print(arr[i] + " was swapped with " + arr[swapped1] + "\n");
                       }
                    }
                }
            System.out.println("Here is the sorted array: " + Arrays.toString(arr) + "\nThere were " + swaps + " swaps made.");
            System.out.print("Thank you for bubble sorting.\n\nGo again, if not then choose 'C'> ");
            userChoice = keyboard.nextLine().toUpperCase().charAt(0);
            if (userChoice != 'C') {
                stillPicking = true;
            }else{
                stillPicking = false;
            }
            break;
        case 'C':
            // End program
            stillPicking = false;
            break;
        default :
            /*
            Also I know I repeat "or choose 'C' to end" a lot but I do it just incase the user somehow forgot or was confused if they still had the same 3 options.
            I am babying the user basically, I hope that is fine.
            And also because you said "consistency is key" or something so I thought I would make sure to repeat that everytime since I already repeated it once.
            */
            System.out.print("That is not an option please try again, or choose 'C' to end the program> ");
            userChoice = keyboard.nextLine().toUpperCase().charAt(0);
            if (userChoice != 'C') {
                stillPicking = true;
            }else{
                keyboard.close();
                stillPicking = false;
            }
          }
        } while (stillPicking);  
    }
}
