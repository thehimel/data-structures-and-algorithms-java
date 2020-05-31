import java.util.Arrays;
import java.util.Collections;

//Reference: https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
public class c21_sort_with_jdk_2_strings {
    public static void main(String[] args) {
        String[] input = {"learn", "practice", "implement"};
        String[] s = new String[input.length];

        //sort array in alphabetic order
        copyArray(input, s);
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        //sort array in descending alphabetic order
        copyArray(input, s);
        Arrays.sort(s, Collections.reverseOrder());
        System.out.println(Arrays.toString(s));
    }

    //copy the elements of a to b
    public static void copyArray(String[] fromArray, String[] toArray){
        for(int i=0; i<fromArray.length; i++){
            toArray[i] = fromArray[i];
        }
    }
}
