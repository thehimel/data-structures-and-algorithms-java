//Stable Counting Sort Algorithm handling negative numbers

public class c17_counting_sort_2_stable_neg {
    public static void main(String[] args){
        int[] a = {-5, 5, 9, 8, -2, 8, 7, 10, 4, 3};
        int i, min = findMin(a);

        printArray(a);
        /* we can only work with +ve numbers in this technique. So, if we have -ve numbers,
        we'll transform the whole array into +ve number just by adding the opposite -ve number with each element.
        That means, if we have min=-5, we'll add +5 with all the elements. 5 = -(-5).
        Eg. a = {2, -5, 2, 10}. Here min = -5. New a = {7, 0, 7, 15}. */
        for(i=0; i<a.length; i++)
            a[i] = a[i] - min;

        printArray(a);

        int max = findMax(a);
        int[] count = new int[max+1];
        int[] output = new int[a.length];

        for(i=0; i<a.length; i++){
            count[a[i]]++;
        }

        for(i=1; i<count.length; i++){
            count[i]+=count[i-1];
        }

        for(i=a.length-1; i>=0; i--){
            output[--count[a[i]]] = a[i];
        }

        printArray(output);

        /* remember we subtracted the minimum value from each elements. Now add it back in the final output. */
        for(i=0; i<a.length; i++){
            a[i] = output[i]+min;
        }

        printArray(a);

    }

    public static int findMax(int[] a){
        int max = a[0];
        for(int value: a){
            if(value>max)
                max=value;
        }
        return max;
    }

    public static int findMin(int[] a){
        int min = a[0];
        for(int value: a){
            if(value<min)
                min=value;
        }
        return min;
    }

    public static void printArray(int[] a){
        for(int value: a){
            System.out.print(value+ " ");
        }
        System.out.println();
    }
}
