import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "11");
        linkedHashMap.put(2, "12");
        linkedHashMap.put(3, "13");
        linkedHashMap.put(4, "14");
        linkedHashMap.put(5, "15");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        String rollno = linkedHashMap.get(2);
        System.out.println("Element with key 2: " + rollno);

        linkedHashMap.remove(3);
        System.out.println("After removing key 3: " + linkedHashMap);

        linkedHashMap.put(3, "16");
        System.out.println("After Updating,Iterating through LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Roll Number: " + entry.getValue());
        }
    }
}