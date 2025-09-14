// Custom Exception class
class UserException extends Exception {
    public UserException(String details) {
        super("Exception[" + details + "]");
    }
}

// Class with method compute()
class ExceptionDemo {
    // Method that throws the custom exception if the integer is greater than 30
    public void compute(int number) throws UserException {
        if (number > 30) {
            throw new UserException("Value " + number + " exceeds limit 30");
        } else {
            System.out.println("The integer value is: " + number);
        }
    }

    // Main method to test the compute method
    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();

        // Test cases
        try {
            demo.compute(25); // This should print the value
            demo.compute(35); // This should throw the exception
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }
    }
}
