//Reference (Theory): Quick Sort Algorithm by Jenny's lectures CS/IT NET&JRF. URL: https://youtu.be/QN9hnmAgmOc
//Reference (Code): https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/

public class c15_quick_sort {
    public static void main(String[] args) {
        int[] a={20, 35, -15, 7, 55, 1, -22};
        quickSort(a, 0, a.length-1);

        for (int value : a)
            System.out.print(value + " ");
    }
    public static int partition(int[] a, int start, int end){
        int i = start+1;
        int pivot = a[start]; //make the first element as the pivot element
        for(int j = start+1; j<=end; j++){
            if(a[j]<pivot){
                swap(a, i, j); //swap(a[i], a[j])
                i++;
            }
        }
        swap(a, start, i-1); //swap(a[start], a[i-1]); Moving pivot to its correct position
        return i-1;
    }
    public static void quickSort(int[] a, int start, int end){
        if(start < end){
            int pivotPos = partition(a, start, end);
            quickSort(a, start, pivotPos-1);
            quickSort(a, pivotPos+1, end);
        }
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
