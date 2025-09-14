public class Fibonacci {

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base case: return n for the first two Fibonacci numbers
        if (n <= 0) {
            return 0; // Fibonacci(0) = 0
        } else if (n == 1) {
            return 1; // Fibonacci(1) = 1
        } else {
            // Recursive case: return the sum of the two preceding Fibonacci numbers
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Example: calculate the 10th Fibonacci number
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
