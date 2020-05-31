//Reference: Counting Sort Algorithm by Jenny's lectures CS/IT NET&JRF. URL: https://youtu.be/pEJiGC-ObQE
public class c17_counting_sort_1_stable {
    public static void main(String[] args){
        int[] a = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        int max = findMax(a); //find the max value in the array
        int i;
        int[] count = new int[max+1]; //create a count array to hold numbers from 0 to the max number
        int[] output = new int[a.length]; //output array has length same as the input array a[]

        //count number of occurrences
        for(i=0; i<a.length; i++){
            count[a[i]]++;
        }

        //find cumulative frequency
        for(i=1; i<count.length; i++){
            count[i]+=count[i-1];
        }

        /* copy the elements from input array a[] to output[] according to the information stored in count[].
        Decrement the index value before copying. Thus prefix decrement is used. */
        for(i=a.length-1; i>=0; i--){
            output[--count[a[i]]] = a[i];
        }

        //copy the elements from the output array to the input array[]
        for(i=0; i<a.length; i++){
            a[i] = output[i];
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
