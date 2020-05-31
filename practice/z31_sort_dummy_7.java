import java.util.Arrays;

public class z31_sort_dummy_7 {
    public static void main(String[] args){
        int[] a = {2, 5, -5, 8, -2, 8, -5, 7, 10, 4, 3};



        System.out.println(Arrays.toString(a));
    }

    public static int findMax(int[] a){
        int max = a[0];
        for(int value: a){
            if(value>max)
                max=value;
        }
        return max;
    }

    public static int findMin(int[] a){
        int min = a[0];
        for(int value: a){
            if(value<min)
                min=value;
        }
        return min;
    }
}
