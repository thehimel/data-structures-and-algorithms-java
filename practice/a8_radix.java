import java.util.Arrays;

public class a8_radix {
    public static void main(String[] args){
        int[] a = {4382, 8, 530, 90, 88, 231, 11, 45, 677, 199};
        int max = findMax(a);
        for(int pos=1; max/pos>0; pos*=10){
            digitCountingSort(a, pos);
            printArray(a);
        }
        printArray(a);
    }
    public static void digitCountingSort(int[] a, int pos){
        int i;
        int[] count = new int[10];
        int[] output = new int[a.length];

        for(i=0; i<a.length; i++){
            int index = (a[i]/pos) % 10;
            count[index]++;
        }

        for(i=1; i<count.length; i++){
            count[i]+=count[i-1];
        }

        for(i=a.length-1; i>=0; i--){
            int index = (a[i]/pos) % 10;
            output[--count[index]] = a[i];
        }

        for(i=0; i<a.length; i++){
            a[i] = output[i];
        }
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
