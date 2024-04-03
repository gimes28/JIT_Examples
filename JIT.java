//package rr.jittest;
public class JIT {
    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        int n1 = 1;
        int n2 = 1;
        int result = 0;

        for(int i = 3; i <= n; i++ ) {
            result = n1 + n2;
            n2 = n1;
            n1 = result;
        }

        return result;
    }

    public static void trackExecutionSpeed() {
        System.out.println(
               "Average time to execute f(100) in nanoseconds");
        for(int i = 0; i < 100; i++) {
            long startTime = System.nanoTime();
            for(int j = 0; j < 50; j++) {
                fib(100);
            }
            long totalTime = System.nanoTime() - startTime;
            System.out.println(String.format("%f", 
                               totalTime / 50.0));
        }
    }

    public static void main(String[] args) {
        trackExecutionSpeed();
    }
}
