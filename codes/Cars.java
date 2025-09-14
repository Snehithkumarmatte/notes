// Abstract class Car
abstract class Car {
    // Abstract methods without implementation
    abstract void m1();  // Method 1
    abstract void m2();  // Method 2
}

// Class BMW extending Car
class BMW extends Car {
    @Override
    void m1() {
        System.out.println("BMW's implementation of method m1.");
    }

    @Override
    void m2() {
        System.out.println("BMW's implementation of method m2.");
    }
}

// Class Benz extending Car
class Benz extends Car {
    @Override
    void m1() {
        System.out.println("Benz's implementation of method m1.");
    }

    @Override
    void m2() {
        System.out.println("Benz's implementation of method m2.");
    }
}

// Main class to test the implementation
public class Cars {
    public static void main(String[] args) {
        Car bmwCar = new BMW();
        bmwCar.m1();
        bmwCar.m2();

        Car benzCar = new Benz();
        benzCar.m1();
        benzCar.m2();
    }
}
