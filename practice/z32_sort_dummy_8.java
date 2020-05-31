import java.util.Arrays;

public class z32_sort_dummy_8 {
    public static void main(String[] args){
        int[] a = {4382, 8, 530, 90, 88, 231, 11, 45, 677, 199};

        printArray(a);
    }

    public static int findMax(int[] a){
        int max = a[0];
        for(int value: a){
            if(value>max)
                max = value;
        }
        return max;
    }
    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }
}
