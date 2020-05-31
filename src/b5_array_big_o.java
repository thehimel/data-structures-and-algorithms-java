//Reference: https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/
public class b5_array_big_o {
    public static void main(String[] args) {
        int[] intArray = new int[] {20, 35, -15, 7, 55, 1, -22};

        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] == 7){
                System.out.println("index = " + i);
                break;
            }
        }
    }
}
