public class FibonacciSequence {
    public static void main(String[] args) {
        int limit = 10000; // Set the limit
        int fib0 = 0;
        int fib1 = 1;

        // Display the initial term
        System.out.println(fib0);

        // Loop until the next term reaches the limit
        while (fib1 < limit) {
            System.out.println(fib1);
            int nextFib = fib0 + fib1;
            fib0 = fib1;
            fib1 = nextFib;
        }
    }
}
