import java.util.Arrays;

public class z23_sort_test_5_6 {
    public static int[] mergeSort(int[] a){

        return a;
    }

    public static int[] quickSort(int[] a) {
        quick(a, 0, a.length-1);
        return a;
    }
    public static void quick(int[] a, int start, int end){
        if(start<end){
            int pivotPos = partition(a, start, end);
            quick(a, start, pivotPos-1);
            quick(a, pivotPos+1, end);
        }
    }
    public static int partition(int[] a, int start, int end){
        int i = start+1;
        int pivot = a[start];
        for(int j = start+1; j<=end; j++){
            if(a[j]<pivot){
                swap(a, i, j);
                i++;
            }
        }
        swap(a, start, i-1);
        return i-1;
    }
    public static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void printArray(int[] a, String str){
        System.out.println(str + Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] m = {20, 35, -15, 7, 55, 1, -22};
        int[] q = {20, 35, -15, 7, 55, 1, -22};

        printArray(mergeSort(m), "5. Merge Sort: ");
        printArray(quickSort(q), "5. Quick Sort: ");
    }
}
