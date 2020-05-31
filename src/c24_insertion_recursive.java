/*
Challenge: implement recursion in insertion sort
Solution:
with recursion, we are just replacing the outer for loop.
The outer for loop goes from index 1 to array.length-1.
So, we will keep calling the recursive function until only 2 items are needed to be sorted.
The number of items are reduced at every call and the action is saved in call stack.
When it starts sorting, it will start sorting 1 more item at each call.
It will use the call stack to complete recursion at each pass.
 */
import java.util.Arrays;

public class c24_insertion_recursive {
    public static void main(String[] args) {
        int[] a={35, 20, -15, 7, 55, 1, -22};
        callRecursion(a, a.length);
        printArray(a);
    }
    public static void callRecursion(int[] a, int numItems){
        if(numItems<2){
            return; //this is the breaking condition to finish the callRecursion()
        }
        callRecursion(a, numItems-1); //at each call we reduce the number of items to be sorted

        insertionSort(a, numItems); //finally we start sorting when it has 2 items to be sorted
    }
    public static void insertionSort(int[] a, int numItems){
        /* the control will come here when numItems>=2. And we want to start from temp = a[1] and j = a[0]
        We get temp = a[numItems-1] = a[1], and j = numItems-2 = 0. */
        int temp = a[numItems-1];
        int j = numItems-2;
        while(j>=0 && a[j]>temp){
            a[j+1] = a[j];
            j--;
        }
        a[j+1] = temp;
        printArray(a);
    }
    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }
}
