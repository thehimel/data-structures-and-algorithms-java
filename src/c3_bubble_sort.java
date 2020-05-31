import java.util.Arrays;

public class c3_bubble_sort
{
    public static void main(String[] args){
        int[] a={20, 35, -15, 7, 55, 1, -22};

        /* j = unsortedPartitionIndex. At first it will be initialized to the highest index value = array length -1.
        It will iterate until the value is greater then 0. After every iteration, it will decreased by 1. */
        for(int j = a.length-1; j>0; j--){
            //with i, traverse through the array till the unSortedPartitionIndex = j
            for(int i=0; i<j; i++){
                //if the present array element is greater than the next array element, perform swap
                if(a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }

        //print the sorted array
        System.out.println(Arrays.toString(a));
    }
}