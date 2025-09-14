// Abstract class Person
abstract class Person {
    // Abstract method to describe eating habits
    public abstract void eat();

    // Abstract method to describe exercise habits
    public abstract void exercise();
}

// Subclass Athlete that extends Person
class Athlete extends Person {

    // Implementation of eat method for an Athlete
    @Override
    public void eat() {
        System.out.println("Athlete is eating a high-protein diet.");
    }

    // Implementation of exercise method for an Athlete
    @Override
    public void exercise() {
        System.out.println("Athlete is doing intense training and workouts.");
    }
}

// Subclass LazyPerson that extends Person
class LazyPerson extends Person {

    // Implementation of eat method for a LazyPerson
    @Override
    public void eat() {
        System.out.println("Lazy person is eating fast food.");
    }

    // Implementation of exercise method for a LazyPerson
    @Override
    public void exercise() {
        System.out.println("Lazy person prefers sitting on the couch instead of exercising.");
    }
}

// Main class to demonstrate the abstract class and its subclasses
public class PersonDemo {
    public static void main(String[] args) {
        // Creating an instance of Athlete
        Person athlete = new Athlete();
        athlete.eat();      // Calls Athlete's implementation of eat
        athlete.exercise(); // Calls Athlete's implementation of exercise

        // Creating an instance of LazyPerson
        Person lazyPerson = new LazyPerson();
        lazyPerson.eat();      // Calls LazyPerson's implementation of eat
        lazyPerson.exercise(); // Calls LazyPerson's implementation of exercise
    }
}
