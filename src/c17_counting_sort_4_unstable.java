//Note: This is the unstable implementation of counting sort.Understand the stable version first, then read this one.

public class c17_counting_sort_4_unstable {
    public static void main(String[] args){
        int[] a = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        int max = findMax(a); //find the max value in the array
        int i;
        int[] count = new int[max+1]; //create a count array to hold numbers from 0 to the max number

        //count number of occurrences
        for(i=0; i<a.length; i++){
            count[a[i]]++;
        }

        int j=0; //index to go from the first element to the last element in a[]
        /* our count array stores the information of item occurrences. Now, we create the input array a[] such that,
        the index i of count[] is written as the item in a[j] if count[i]>0. After writing, increment the j value,
        and decrement the occurrence with count[i]--. */
        for(i=0; i<count.length; i++){
            while(count[i]>0){
                a[j++] = i;
                count[i]--;
            }
        }

        for(int value: a){
            System.out.print(value+ " ");
        }
    }

    public static int findMax(int[] a){
        int max = a[0];
        for(int value: a){
            if(value>max)
                max=value;
        }
        return max;
    }
}
