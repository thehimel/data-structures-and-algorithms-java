public class c11_iterative_factorial {
    public static void main(String[] args) {
        int num = 5;
        int iterativeResult = iterativeFactorial(num);
        System.out.println("iterativeFactorial = " + iterativeResult);
    }

    public static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }

        int factorial = 1;
        for(int i=num; i>0; i--){     //5!=5x4x3x2x1
            factorial *= i;
        }
        return factorial;
    }
}

/*
Method 2:
5!=1x2x3x4x5
for(int i=1; i<=num; i++){...}
 */