//Reference: https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/
//Reference: https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
import java.util.Arrays;
import java.util.Collections;

public class c21_sort_with_jdk_1 {
    public static void main(String[] args) {
        int[] input={20, 35, -15, 7, -5, 1, -22};
        int[] a = new int[input.length];

        //sort entire array
        copyArray(input, a);
        Arrays.sort(a);
        System.out.println("Input Array: " + Arrays.toString(input));
        System.out.println("Arrays.sort(a): " + Arrays.toString(a));

        //sort index 0 to 4 in the array
        copyArray(input, a);
        Arrays.sort(a, 0, 5);
        System.out.println("Input Array: " + Arrays.toString(input));
        System.out.println("Arrays.sort(a, 0, 5): " + Arrays.toString(a));

        //sort index 2 to 5 in the array
        copyArray(input, a);
        Arrays.sort(a, 2, 6);
        System.out.println("Input Array: " + Arrays.toString(input));
        System.out.println("Arrays.sort(a, 2, 6): " + Arrays.toString(a));

        //BEST PRACTICE: sort index 2 to 5 in the array
        copyArray(input, a);
        Arrays.sort(a, 2, 5+1);
        System.out.println("Input Array: " + Arrays.toString(input));
        System.out.println("Arrays.sort(a, 2, 5+1): " + Arrays.toString(a));


        /* Sorts arr[] in descending order.
        Note that we have Integer here instead of int[].
        Collections.reverseOrder doesn't work for primitive types. */
        copyArray(input, a);
        Integer[] arr = {56, 21, 22, -8, 45, -96, 60, 20};
        System.out.println("Input Array: " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Arrays.sort(arr, Collections.reverseOrder()): " + Arrays.toString(arr));

        System.out.println("\n\n");

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
