public class c11_recursion {
    public static void main(String[] args) {
        int num = 5;
        int recursiveResult = recursiveFactorial(num);
        System.out.println("recursiveFactorial = " + recursiveResult);
    }

    public static int recursiveFactorial(int num){
        if(num==0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }
}
