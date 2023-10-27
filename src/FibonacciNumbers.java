public class FibonacciNumbers {
    public static void main(String[] args) {
        int fib = 1;
        int y = 2;
        int sum = 0;
        for (int x = fib ;fib < 4000000 ; x++) {
            if(fib %2 == 0){
                sum = sum +fib;
            }
            int z = fib + y;
            fib = y;
            y = z;
        }
        System.out.println(sum);
    }
}
