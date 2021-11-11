import java.util.*;
public class Unit17 {
public static void main(String[] args){
    // Example of swapping things:
    int x=7; int y=5; 
        System.out.println("After: ");
        System.out.println("x is :" + x);
        System.out.println("y is :" + y);
        int temp = 0;
        temp = x; x=y; y=temp;
        System.out.println("Before: ");
        System.out.println("x is :" + x);
        System.out.println("y is :" + y);

        //Making random number generator:
    Random random = new Random();

    // Making array/array length:
    int[] arr = new int[8];

    // Filling array with random numbers:
    for (int i=0; i<arr.length; i++) {
         arr[i] = random.nextInt(250) + 1;

        }

        // Printing our array that has our random numbers in it:
        System.out.println("Before:" + Arrays.toString(arr));
        
        // Sorting:
        
        for (int i=1; i<arr.length; i++) {
            int temporary = 0;
            int j = i-1;
            while (j >= 0 && arr[i]<arr[j]) {
                temporary = arr[j];
                arr[j] = arr[i];
                arr[i] = temporary;
                j--;
                i--;
            }
            // int index = i;
            // int nextTerm = arr[i+1];
            // int previousTerm = arr[i];
            // while (index >= 0 && previousTerm < nextTerm) {
            //     index = previousTerm;
            //         arr[i]=arr[i];
            //         arr[i]=temp;
            //         index--;
            //     System.out.println("During while loop: " + Arrays.toString(arr));
            // }
            // System.out.println("During for loop: " + Arrays.toString(arr));
        }
            System.out.println("After: " + Arrays.toString(arr));


            // Failed attempt at sorting:
            /*
            for (int j=1; j<arr.length-2; j++) {
                int temp = 0;
                if (arr[index++] > arr[i+1]) {
                    temp = arr[i];
                    arr[i]=arr[i];
                    arr[i]=temp;
                    System.out.println(Arrays.toString(arr));
                    System.out.println(index);
                } 
                */
                // while (i>=0 && arr[i] > arr[j]) {

                // }
    }  
}
