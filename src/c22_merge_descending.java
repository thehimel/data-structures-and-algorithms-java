/*
Challenge: Perform merge sort to sort elements in descending order.
Solution:
During the merge operation, just put the larger elements first, and that will form merging
as larger to smaller values (descending order).
Splitting will remain same, as we don't sort while splitting.
 */

import java.util.Arrays;

public class c22_merge_descending {
    public static void main(String[] args) {
        int[] a={20, 35, -15, 7, 55, 1, -22};
        split(a, 0, a.length-1);

        System.out.println(Arrays.toString(a));
    }

    public static void split(int[] inputArray, int start, int end){
        if(start < end) {
            int mid = (start + end) / 2; //defines the current array in 2 parts
            split(inputArray, start, mid); //sort the 1st part of array
            split(inputArray,mid+1, end); //sort the 2nd part of array

            // merge the both parts by comparing elements of both the parts.
            merge(inputArray,start, mid, end);
        }
    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        //stores the starting position of both parts in temporary variables
        int p = start, q = mid+1;

        int[] tempArray = new int[end-start+1];
        int k=0;

        for(int i = start; i <= end; i++){
            if(p > mid)      //checks if first part comes to an end or not
                tempArray[k++] = inputArray[q++] ;

            else if ( q > end)   //checks if second part comes to an end or not
                tempArray[k++] = inputArray[p++];

            /* ***********************************************************************
            for descending, we will take the larger elements first in the tempArray[].
            Changed less than (<) to greater than (>) for descending order
             *********************************************************************** */
            else if(inputArray[p] > inputArray[q])
                tempArray[k++] = inputArray[p++];

            else
                tempArray[k++] = inputArray[q++];
        }

        //Now the real array has elements in sorted manner including both parts
        //important to define the index as start++ in inputArray[]
        k=0;
        while(k<tempArray.length){
            inputArray[start++] = tempArray[k++];
        }
    }
}