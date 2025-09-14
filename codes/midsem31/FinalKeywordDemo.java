// Final class that cannot be inherited
final class FinalClass {
    // Method in final class
    public void display() {
        System.out.println("This is a final class. It cannot be inherited.");
    }
}

// Base class with a final method
class Base {
    // Final method that cannot be overridden
    public final void show() {
        System.out.println("This is a final method in the Base class.");
    }
}

// Derived class that extends Base
class Derived extends Base {
    // Uncommenting the following method will result in a compilation error
    // public void show() {
    //     System.out.println("Trying to override the final method.");
    // }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Creating an object of the final class
        FinalClass finalObj = new FinalClass();
        finalObj.display(); // Calls the method in the final class

        // Creating an object of the Base class
        Base baseObj = new Base();
        baseObj.show(); // Calls the final method in Base class

        // Creating an object of the Derived class
        Derived derivedObj = new Derived();
        derivedObj.show(); // Calls the final method in Base class
    }
}
