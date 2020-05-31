import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class a2_selection {
    public static void main(String[] args) {
        Instant start = Instant.now();
        int[] a = {20, 35, -15, 7, 55, 1, -22};

        for(int i=a.length-1; i>0; i--){
            int largest = 0;
            for(int j=1; j<=i; j++){
                if(a[j]>a[largest]){
                    largest=j;
                }
            }
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(" "); Instant end = Instant.now(); System.out.println(Duration.between(start, end));
    }
}
