//Theory: https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/
// Implementation: https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/tutorial/

import java.util.Arrays;

public class c13_merge_sort{
    public static void main(String[] args){
        int[] a={20, 35, -15, 7, 55, 1, -22};
        split(a, 0, a.length-1);

        System.out.println(Arrays.toString(a));
    }

    public static void split(int[] inputArray, int start, int end)
    {
        if(start < end) {
            int mid = (start + end) / 2;           // defines the current array in 2 parts
            split(inputArray, start, mid);                 // sort the 1st part of array
            split(inputArray,mid+1, end);              // sort the 2nd part of array

            // merge the both parts by comparing elements of both the parts.
            merge(inputArray,start, mid, end);
        }
    }

    public static void merge(int[] inputArray, int start, int mid, int end){
        //stores the starting position of both parts in temporary variables
        int p = start, q = mid+1;

        int[] tempArray = new int[end-start+1];
        int k=0;

        for(int i = start; i <= end; i++) {
            if(p > mid) //checks if first part comes to an end or not
                tempArray[k++] = inputArray[q++] ;

            else if ( q > end) //checks if second part comes to an end or not
                tempArray[k++] = inputArray[p++];

            else if(inputArray[p] < inputArray[q]) //checks which part has smaller element
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

        /* Another way for doing so with for loop:
        //Now the real array has elements in sorted manner including both parts
        for (int i=0; i<k; i++){
            inputArray[start++] = tempArray[i]; //important to define the index as start++ in inputArray[]
        }
        */
    }
}