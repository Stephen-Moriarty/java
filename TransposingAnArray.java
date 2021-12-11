import java.util.*;
public class TransposingAnArray {
        public static void main(String[] args){
            // First half
        int count = 1;
        int[][] arr  = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = count++;
            }
        }

        // The enchached for loop
        System.out.println("The unspun array:");
        System.out.println(Arrays.deepToString(arr));
        for (int[] row : arr){
            for(int value : row){
                System.out.print(value + "");
            }
            System.out.println();
        }
        // Second half
        // Trying to transpose the array
        int c=0, d=0;
        int[][] transArr = new int[3][3];
        for(int i=arr.length-1; i>=0; i--){
            for (int j=0; j<arr.length; j++){
                transArr[j][d] = arr[c][i];
                //arr[i][j] = count++;
                
                c++;
            }
            c=0;
            d++;
        //d=0;
        }

        // Transposing the array
        System.out.println("The transposed array: ");
        //Arrays.deepToString(arr);
        System.out.println(Arrays.deepToString(transArr));
        for (int[] row : transArr){
            for(int value : row){
                System.out.print(value + "");
            }
            System.out.println();
        }

        //
        int[][] spunArr = new int[3][3];
        for(int i=transArr.length-1; i>=0; i--){
            for (int j=0; j<transArr.length; j++){
                transArr[c][d] = spunArr[j][i];
                //transArr[i][j] = ;
                
                d++;
            }
            d=0;
            c++;

            }
        System.out.println("The transposed array: ");
                //Arrays.deepToString(arr);
                System.out.println(Arrays.deepToString(transArr));
                for (int[] row : transArr){
                    for(int value : row){
                        System.out.print(value + "");
                    }
                    System.out.println();
                }
                System.out.println("The transposed spun array: ");
                //Arrays.deepToString(arr);
                System.out.println(Arrays.deepToString(spunArr));
                for (int[] row : spunArr){
                    for(int value : row){
                        System.out.print(value + "");
                    }
                    System.out.println();
                }
    } 
}
