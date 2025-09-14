// Assume this class comes from the library L1
class abc {
    // Original methods for integer operations
    public int m1(int a, int b) {
        return a + b;  // Addition of integers
    }

    public int m2(int a, int b) {
        return a - b;  // Subtraction of integers
    }

    public int m3(int a, int b) {
        return a * b;  // Multiplication of integers
    }
}

// New class that overrides methods to handle floating-point numbers
class FloatingPointOperations extends abc {
    // Overriding m1 for floating-point addition
    public double m1(double a, double b) {
        return a + b;  // Addition of floating-point numbers
    }

    // Overriding m2 for floating-point subtraction
    public double m2(double a, double b) {
        return a - b;  // Subtraction of floating-point numbers
    }

    // Overriding m3 for floating-point multiplication
    public double m3(double a, double b) {
        return a * b;  // Multiplication of floating-point numbers
    }
}

public class Floatingnumbers {
    public static void main(String[] args) {
        FloatingPointOperations fpOperations = new FloatingPointOperations();
        
        // Perform operations with floating-point numbers
        System.out.println("Addition: " + fpOperations.m1(5.5, 3.2));
        System.out.println("Subtraction: " + fpOperations.m2(5.5, 3.2));
        System.out.println("Multiplication: " + fpOperations.m3(5.5, 3.2));
    }
}
