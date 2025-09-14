// Generic interface MinMax to define min() and max() methods
interface MinMax<T extends Comparable<T>> {
    T min();  // Method to return the minimum value
    T max();  // Method to return the maximum value
}

// Implementing class that implements the MinMax interface
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    private T[] values;

    // Constructor to initialize the array of values
    public MyClass(T[] values) {
        this.values = values;
    }

    // Method to find the minimum value in the array
    @Override
    public T min() {
        T minValue = values[0];
        for (T value : values) {
            if (value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }
        return minValue;
    }

    // Method to find the maximum value in the array
    @Override
    public T max() {
        T maxValue = values[0];
        for (T value : values) {
            if (value.compareTo(maxValue) > 0) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}

// Main class to test the generic interface and implementation
public class GenericMinMaxDemo {
    public static void main(String[] args) {
        // Create an array of Integer objects
        Integer[] intArray = {3, 6, 2, 8, 6};
        // Create an instance of MyClass with Integer type
        MyClass<Integer> intObj = new MyClass<>(intArray);
        // Find and display the minimum and maximum of integers
        System.out.println("Min value in intArray: " + intObj.min());
        System.out.println("Max value in intArray: " + intObj.max());

        // Create an array of String objects
        String[] strArray = {"apple", "orange", "banana", "pear"};
        // Create an instance of MyClass with String type
        MyClass<String> strObj = new MyClass<>(strArray);
        // Find and display the minimum and maximum of strings
        System.out.println("Min value in strArray: " + strObj.min());
        System.out.println("Max value in strArray: " + strObj.max());
    }
}
