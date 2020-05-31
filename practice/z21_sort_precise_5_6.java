import java.util.Arrays;

public class z21_sort_precise_5_6 {
    public static int[] mergeSort(int[] a){
        split(a, 0, a.length-1);
        return a;
    }
    public static void split(int[] a, int s, int e){
        if(s<e){
            int m=(s+e)/2;
            split(a, s, m);
            split(a, m+1, e);
            merge(a, s, m, e);
        }
    }
    public static void merge(int[] a, int s, int m, int e){
        int p=s, q=m+1, k=0;
        int[] t = new int[e-s+1];
        for(int i=s; i<=e; i++) {
            if (p > m)
                t[k++] = a[q++];
            else if (q > e)
                t[k++] = a[p++];
            else if (a[p] < a[q])
                t[k++] = a[p++];
            else
                t[k++] = a[q++];
        }
        for(int v: t){
            a[s++] = v;
        }
    }

    public static int[] quickSort(int[] a) {
        quick(a, 0, a.length-1);
        return a;
    }
    public static void quick(int[] a, int s, int e){
        if(s < e){
            int pPos = partition(a, s, e);
            quick(a, s, pPos-1);
            quick(a, pPos+1, e);
        }
    }
    public static int partition(int[] a, int s, int e){
        int i = s+1;
        int p = a[s];
        for(int j = s+1; j<=e; j++){
            if(a[j]<p){
                swap(a, i, j);
                i++;
            }
        }
        swap(a, s, i-1);
        return i-1;
    }
    public static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
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
