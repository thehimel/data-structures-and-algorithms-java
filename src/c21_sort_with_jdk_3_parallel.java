//Reference: https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/
//Reference: https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/

import java.util.Arrays;

public class c21_sort_with_jdk_3_parallel {
    public static void main(String[] args) {
        int[] input={20, 35, -15, 7, -5, 1, -22};
        int[] a = new int[input.length];

        //sort entire array
        copyArray(input, a);
        Arrays.parallelSort(a);
        System.out.println("Input Array: " + Arrays.toString(input));
        System.out.println("Arrays.parallelSort(a): " + Arrays.toString(a));

        //sort index 0 to 4 in the array
        copyArray(input, a);
        Arrays.parallelSort(a, 0, 5);
        System.out.println("Input Array: " + Arrays.toString(input));
        System.out.println("Arrays.parallelSort(a, 0, 5): " + Arrays.toString(a));

        //sort index 2 to 5 in the array
        copyArray(input, a);
        Arrays.parallelSort(a, 2, 6);
        System.out.println("Input Array: " + Arrays.toString(input));
        System.out.println("Arrays.parallelSort(a, 2, 6): " + Arrays.toString(a));

        //BEST PRACTICE: sort index 2 to 5 in the array
        copyArray(input, a);
        Arrays.parallelSort(a, 2, 5+1);
        System.out.println("Input Array: " + Arrays.toString(input));
        System.out.println("Arrays.parallelSort(a, 2, 5+1): " + Arrays.toString(a));
        System.out.println("\n\n");
    }

    //copy the elements fromArray to toArray
    public static void copyArray(int[] fromArray, int[] toArray){
        for(int i=0; i<fromArray.length; i++){
            toArray[i] = fromArray[i];
        }
    }
}
