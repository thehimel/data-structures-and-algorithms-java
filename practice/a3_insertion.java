import java.util.Arrays;

public class a3_insertion {
    public static void main(String[] args){
        int[] a={20, 35, -15, 7, 55, 1, -22};
        for(int i=1; i<a.length; i++){
            int temp = a[i];
            int j = i-1;
            while(j>=0 && a[j]>temp){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
