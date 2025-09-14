import java.util.TreeSet;

class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    
        int first = numbers.first();
        System.out.println("First Number: " + first);

        int last = numbers.last();
        System.out.println("Last Number: " + last);

	numbers.add(8);
	numbers.add(10);
	System.out.println("Using higher: " + numbers.higher(8));

        System.out.println("Using lower: " + numbers.lower(8));

        System.out.println("Using ceiling: " + numbers.ceiling(8));

        System.out.println("Using floor: " + numbers.floor(3));


}
}
