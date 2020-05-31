import java.util.Arrays;

public class z22_sort_dummy_5_6 {
    public static int[] mergeSort(int[] a){

        return a;
    }

    public static int[] quickSort(int[] a) {

        return a;
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
