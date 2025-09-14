class FactorialThread extends Thread {
    private int n;
    private long factorialResult;

    public FactorialThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        factorialResult = factorial(n);
        System.out.println("Factorial of " + n + " is: " + factorialResult);
    }

    private long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public long getFactorialResult() {
        return factorialResult;
    }
}

class LargestNumberThread extends Thread {
    private int num1;
    private int num2;

    public LargestNumberThread(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        int largest = Math.max(num1, num2);
        System.out.println("Largest number is: " + largest);
    }
}

public class Largestnumber {
    public static void main(String[] args) {
        FactorialThread t2 = new FactorialThread(5);
        LargestNumberThread t1 = new LargestNumberThread(10, 20);

        t2.start();  // Start factorial thread first
        try {
            t2.join();  // Wait for t2 to complete before proceeding to t1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.start();  // Now start t1 after t2 completes
    }
}
