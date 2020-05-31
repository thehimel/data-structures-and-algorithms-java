//Reference: Radix Sort - Jenny's Lectures. URL: https://youtu.be/Il45xNUHGp0
public class c20_radix_sort_wc {
    public static void main(String[] args){
        int[] a = {4382, 8, 530, 90, 88, 231, 11, 45, 677, 199};
        int max = findMax(a);
        for(int pos=1; max/pos>0; pos*=10){
            digitCountingSort(a, pos);
            printArray(a);
        }
        printArray(a);
    }
    public static void digitCountingSort(int[] a, int pos){
        int i;
        int[] count = new int[10]; //create a count array to hold numbers from 0 to 9
        int[] output = new int[a.length]; //output array has length same as the input array a[]

        //count number of occurrences
        for(i=0; i<a.length; i++){
            int index = (a[i]/pos) % 10;
            count[index]++;
        }

        //find cumulative frequency
        for(i=1; i<count.length; i++){
            count[i]+=count[i-1];
        }

        /* copy the elements from input array a[] to output[] according to the information stored in count[].
        Decrement the index value before copying. Thus prefix decrement is used. */
        // <-------------------------
        for(i=a.length-1; i>=0; i--){
            int index = (a[i]/pos) % 10;
            output[--count[index]] = a[i];
        }

        //copy the elements from the output array to the input array[]
        for(i=0; i<a.length; i++){
            a[i] = output[i];
        }
    }
    public static int findMax(int[] a){
        int max = a[0];
        for(int value: a){
            if(value>max)
                max = value;
        }
        return max;
    }
    public static void printArray(int[] a){
        for(int value: a){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
