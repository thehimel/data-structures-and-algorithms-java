import java.util.Arrays;

public class c6_selection_sort
{
    public static void main(String[] args)
    {
        int[] a={20, 35, -15, 7, 55, 1, -22};

        /* j = lastUnsortedIndex. At first it will be initialized to the highest index value = array length -1.
        It will iterate until the value is greater then 0. After every iteration, it will decreased by 1. */
        for(int j = a.length-1; j>0; j--)
        {
            int largest = 0; //at first initialize the first index as the largest
            /* with i, traverse through the array till the lastUnsortedIndex = j
            during bubble sort, we start from i=0 and use i<j as we compare i with i+1
            but in selection sort, we start from i=1 and use i<=j as we need to compare the a[largest] with a[j]
            that's why equal is needed along with less than symbol in selection sort
             */
            for(int i = 1; i<=j; i++)
            {
                if(a[i] > a[largest])   //if a[i] is greater than the present largest element, reinitialize largest = i
                {
                    largest = i;
                }
            }

            //swap the largest element with the j=lastUnsortedIndex element
            int temp = a[j];
            a[j] = a[largest];
            a[largest] = temp;
        }

        //print the sorted array
        System.out.println(Arrays.toString(a));
    }
}