import java.util.Arrays;

public class z13_sort_test_1_4 {
    public static int[] bubbleSort(int[] a){
        for(int i=a.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public static int[] selectionSort(int[] a){
        for(int i=a.length-1; i>0; i--){
            int largest = 0;
            for(int j=1; j<=i; j++){
                if(a[j]>a[largest]){
                    largest=j;
                }
            }
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;
        }
        return a;
    }
    public static int[] insertionSort(int[] a){
        for(int i=1; i<a.length; i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        return a;
    }
    public static int[] shellSort(int[] a){
        for(int gap=a.length/2; gap>0; gap/=2){
            for(int i=gap; i<a.length; i++){
                int temp = a[i];
                int j = i-gap;
                while(j>=0 && a[j]>temp){
                    a[j+gap] = a[j];
                    j-=gap;
                }
                a[j+gap] = temp;
            }
        }
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
