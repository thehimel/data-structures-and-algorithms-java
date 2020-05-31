import java.util.Arrays;

public class a4_shell {
    public static void main(String[] args){
        int[] a={20, 35, -15, 7, 55, 1, -22};
        for(int gap = a.length/2; gap>0; gap/=2){
            for(int i = gap; i<a.length; i++){
                int temp = a[i];
                int j = i-gap;
                while(j>=0 && a[j]>temp){
                    a[j+gap] = a[j];
                    j-=gap;
                }
                a[j+gap] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
