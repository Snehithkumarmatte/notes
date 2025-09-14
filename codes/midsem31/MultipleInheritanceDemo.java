// First interface
interface Printable {
    void print();  // Method to print something
}

// Second interface
interface Showable {
    void show();  // Method to show something
}

// Class that implements both interfaces (achieving multiple inheritance)
class Document implements Printable, Showable {
    
    // Implement the print method from Printable interface
    public void print() {
        System.out.println("Printing the document...");
    }

    // Implement the show method from Showable interface
    public void show() {
        System.out.println("Showing the document details...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Document class
        Document doc = new Document();
        
        // Call the methods of Printable and Showable interfaces
        doc.print();  // Calls the print method from Printable interface
        doc.show();   // Calls the show method from Showable interface
    }
}
