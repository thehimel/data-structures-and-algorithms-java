import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class a1_bubble {
    public static void main(String[] args) {
        Instant start = Instant.now();
        int[] a = {20, 35, -15, 7, 55, 1, -22};

        for(int i=a.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));

        System.out.println(" "); Instant end = Instant.now(); System.out.println(Duration.between(start, end));
    }
}
