public class c11_tail_recursion {
    public static void main(String[] args) {
        int num = 5;
        int recursiveResult = tailRecursiveFactorial(num, 1);
        System.out.println("tailRecursiveFactorial = " + recursiveResult);
    }

    public static int tailRecursiveFactorial(int num, int result){
        if(num==0){
            return result;  //Initially result = 1
        }

        return tailRecursiveFactorial(num-1, result*num);
    }
}
