//Reference: Insertion Sort - Jenny's Lectures. URL: https://youtu.be/yCxV0kBpA6M
//Reference 2: https://www.geeksforgeeks.org/insertion-sort/
import java.util.Arrays;

public class c8_insertion_sort {
    public static void main(String[] args) {
        int[] a={20, 35, -15, 7, 55, 1, -22};
        for(int i=1; i<a.length; i++){
            //store a[i] in temp and make a hole at position i
            int temp = a[i];
            //shift previous elements to right until the correct location for a[i] is found
            int j = i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            //put temp in its correct position
            a[j+1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}