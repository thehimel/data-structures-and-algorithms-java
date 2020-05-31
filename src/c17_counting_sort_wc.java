//Note: This is not required. Better implementation exists.
//Reference: https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/

public class c17_counting_sort_wc {
    public static void main(String[] args){
        int[] a = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        counting(a, 1, 10);
        for(int value: a){
            System.out.print(value+ " ");
        }
    }
    public static void counting(int[] a, int min, int max){
        int[] countArray = new int[max-min+1];

        /* incrementing the number of occurrences in the countArray[]:

        let, the range is from 1 to 10. Here the first element 1, will be stored in index 0.
        Now for value 9, the index=8 will be incremented in countArray[].
        We get index 8 from 9-1 = 9-min = 8

        let, the range is from 35 to 55. Here 35 will be stored in index 0.
        For 44, the index = value-min = 44-35 = 9. */
        for (int value : a) {
            countArray[value - min]++;
        }

        /* copy the elements from countArray[] to input array a[].
        The value is ranged from min to max. index of that value in countArray[] = value-min */
        int i = 0; //array index for input array a[]
        for(int value=min; value<=max; value++){
            while(countArray[value-min]>0){ //if there is any occurrence of the item
                a[i++] = value; //move values to input array a[]. After entering each element, increment its index by 1
                countArray[value-min]--; //decrement the occurrence by 1 in countArray[]
            }
        }
    }
}
