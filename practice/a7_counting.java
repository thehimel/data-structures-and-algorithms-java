import java.util.Arrays;

public class a7_counting {
    public static void main(String[] args){
        int[] a = {2, 5, -5, 8, -2, 8, -5, 7, 10, 4, 3};
        int i, min = findMin(a);

        printArray(a);

        if(min<0){
            for(i=0; i<a.length; i++)
                a[i] = a[i] - min;
        }else{
            min=0;
        }

        printArray(a);
        int max = findMax(a);
        int[] count = new int[max+1];
        int[] output = new int[a.length];

        for(i=0; i<a.length; i++){
            count[a[i]]++;
        }

        for(i=1; i<count.length; i++){
            count[i]+=count[i-1];
        }

        for(i=a.length-1; i>=0; i--){
            output[--count[a[i]]] = a[i];
        }

        printArray(output);

        for(i=0; i<a.length; i++){
            a[i] = output[i]+min;
        }

        printArray(a);

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

    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }
}
