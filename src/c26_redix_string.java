/*
Challenge: Implement radix sort for array of strings.

Solution:
As we are dealing with characters and the characters have numeric values,
we can just subtract 'a' from each character to get the position of that char in the 0-25 number system.
Now, a=0, b=1, c=3, ....., z=25. Our count array will hold numbers from 0 to 25 and count.length = 26.
Now, we need to apply the count sort for each string from right to left. Means, we'll apply the count sort
at last position first, then at last-1, ....., and finally at the first position.
Our count index = s[i].charAt(pos) - 'a';
Suppose the string is s[0] = "bcdef" and pos=2, then index = 'd' - 'a' = 13 - 10 = 3
Thus, count[3] will be incremented.
Then the elements from s[] will be copied to output[] according to the information on count[] applying sorting
at the pos. Finally, output[] will be copied to s[] to update the s[] with sorted elements at pos.
 */

import java.util.Arrays;

public class c26_redix_string {
    public static void main(String[] args) {
        String[] s = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        printStringArray(s);
        // <---------- going from right to left.
        for(int pos=s[0].length()-1; pos>=0; pos--){
            countingSort(s, pos);
            printStringArray(s); //stepwise output
        }
        printStringArray(s); //final output
    }
    public static void countingSort(String[] s, int pos){
        int i;
        int[] count = new int[26];

        for(i=0; i<s.length; i++){
            int index = s[i].charAt(pos) - 'a'; //transforming char into 0-25 number system
            count[index]++;
        }
        for(i=1; i<count.length; i++){
            count[i] += count[i-1];
        }
        String[] output = new String[s.length];
        // <-------------------------
        for(i=s.length-1; i>=0; i--){
            int index = s[i].charAt(pos) - 'a'; //transforming char into 0-25 number system
            output[--count[index]] = s[i];
        }
        for(i=0; i<s.length; i++){
            s[i] = output[i];
        }
    }
    public static void printStringArray(String[] s){
        System.out.println(Arrays.toString(s));
    }
}
