class Element {
    private String element;

    public Element(String element) {
        this.element = element;
    }

    // Synchronized method to delete digit '2' from the element
    public synchronized void deleteDigit2() {
        if (element.contains("2")) {
            System.out.println(Thread.currentThread().getName() + " is deleting digit '2'.");
            element = element.replace("2", "");
            System.out.println("Element after deletion: " + element);
        } else {
            System.out.println("No digit '2' found for deletion by " + Thread.currentThread().getName());
        }
    }

    // Method to get the current value of the element
    public String getElement() {
        return element;
    }
}

// Thread class that performs the delete operation
class DeleteDigitThread extends Thread {
    private Element element;

    public DeleteDigitThread(Element element, String threadName) {
        super(threadName);
        this.element = element;
    }

    @Override
    public void run() {
        element.deleteDigit2();
    }
}

public class Deletedigit2 {
    public static void main(String[] args) {
        // Shared element that contains letters, digits, and special symbols
        Element element = new Element("a1b2c3@#d2ef");

        // Create multiple threads that try to delete digit '2'
        Thread t1 = new DeleteDigitThread(element, "Thread 1");
        Thread t2 = new DeleteDigitThread(element, "Thread 2");

        // Start the threads
        t1.start();
        t2.start();
    }
}
