//Reference: Shell Sort - Jenny's Lectures. URL: https://youtu.be/9crZRd8GPWM
//Reference 2: https://www.geeksforgeeks.org/shellsort/
import java.util.Arrays;

public class c10_shell_sort {
    public static void main(String[] args) {
        int[] a={20, 35, -15, 7, 55, 1, -22};

        //start with gap=n/2 and then reduce the gap up tp gap=1.
        for(int gap = a.length/2; gap>0; gap/=2){
            //perform insertion sort for this gap size.
            for(int i = gap; i<a.length; i++){
                //store a[i] in temp and make a hole at position i
                int temp = a[i];
                //shift previous gap-sorted elements to right until the correct position for a[i] is found
                int j = i-gap;
                while(j>=0 && a[j]>temp){
                    a[j+gap] = a[j];
                    j-=gap;
                }
                //put temp in its correct position
                a[j+gap] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
