// Box class definition
class Box {
    // Instance variables
    double width, height, depth;

    // Parameterized constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to compute the volume of the box
    public double volume() {
        return width * height * depth;
    }

    // Main method to create and test Box objects
    public static void main(String[] args) {
        // Create two Box objects using the constructor
        Box box1 = new Box(10, 20, 15);
        Box box2 = new Box(5, 7, 3);

        // Print the volume of each box
        System.out.println("Volume of Box 1: " + box1.volume());
        System.out.println("Volume of Box 2: " + box2.volume());
    }
}
