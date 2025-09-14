import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("11");
        vector.add("12");
        vector.add("13");
        vector.add("14");
        vector.add("15");
        System.out.println("Vector elements: " + vector);

        String secondElement = vector.get(1);
        System.out.println("Second element: " + secondElement);

        vector.remove("14");
        System.out.println("After removing 14: " + vector);

        System.out.println("Size of vector: " + vector.size());

        vector.set(1,"16");

        System.out.println("After Updating Iterating through vector:");
        for (String rollno : vector) {
            System.out.println(rollno);
        }
    }
}