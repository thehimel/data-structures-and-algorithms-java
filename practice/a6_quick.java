import java.util.Arrays;

public class a6_quick {
    public static void main(String[] args) {
        int[] a={20, 35, -15, 7, 55, 1, -22};
        quickSort(a, 0, a.length-1);

        System.out.println(Arrays.toString(a));
    }
    public static void quickSort(int[] a, int start, int end){
        if(start < end){
            int pivotPos = partition(a, start, end);
            quickSort(a, start, pivotPos-1);
            quickSort(a, pivotPos+1, end);
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
}
