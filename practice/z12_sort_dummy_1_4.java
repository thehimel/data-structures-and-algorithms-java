import java.util.Arrays;

public class z12_sort_dummy_1_4 {
    public static int[] bubbleSort(int[] a){

        return a;
    }

    public static int[] selectionSort(int[] a){

        return a;
    }

    public static int[] insertionSort(int[] a){

        return a;
    }

    public static int[] shellSort(int[] a){

        return a;
    }

    public static void printArray(int[] a, String str){
        System.out.println(str + Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] b = {20, 35, -15, 7, 55, 1, -22};
        int[] s = {20, 35, -15, 7, 55, 1, -22};
        int[] i = {20, 35, -15, 7, 55, 1, -22};
        int[] sh = {20, 35, -15, 7, 55, 1, -22};

        printArray(bubbleSort(b), "1. Bubble Sort: ");
        printArray(selectionSort(s), "2. Selection Sort: ");
        printArray(insertionSort(i), "3. Insertion Sort: ");
        printArray(shellSort(sh), "4. Shell Sort: ");
    }
}
