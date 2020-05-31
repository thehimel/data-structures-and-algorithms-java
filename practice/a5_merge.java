import java.util.Arrays;

public class a5_merge {
    public static void main(String[] args) {
        int[] a={20, 35, -15, 7, 55, 1, -22};
        split(a, 0, a.length-1);

        System.out.println(Arrays.toString(a));
    }

    public static void split(int[] inputArray, int start , int end )
    {
        if(start < end) {
            int mid = (start + end) / 2 ;
            split(inputArray, start, mid) ;
            split(inputArray,mid+1, end) ;

            merge(inputArray, start, mid, end);
        }
    }

    public static void merge(int[] inputArray, int start, int mid, int end) {
        int p = start, q = mid+1;

        int[] tempArray = new int[end-start+1];
        int k=0;

        for(int i = start; i <= end; i++) {
            if(p > mid)
                tempArray[k++] = inputArray[q++] ;

            else if ( q > end)
                tempArray[k++] = inputArray[p++];

            else if(inputArray[p] < inputArray[q])
                tempArray[k++] = inputArray[p++];

            else
                tempArray[k++] = inputArray[q++];
        }

        for (p=0; p<k; p++) {
            inputArray[start++] = tempArray[p];
        }
    }
}