import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    	
    cars.add(0, "Mazda");
    System.out.println(cars);
  
    cars.get(0);
    
    cars.set(0, "Opel");
    for (String i : cars) {
      System.out.println(i);
    }

    cars.remove(0);
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
    
    cars.size();
    cars.clear();
    System.out.println(cars);    

  }
}