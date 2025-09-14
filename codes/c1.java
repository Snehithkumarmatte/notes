package l1;

public class c1 {
    public static int var1 = 100;
    public static int var2 = 200;

    public void m1() {
        System.out.println("l1: c1 - m1()");
    }

    public void m2() {
        System.out.println("l1: c1 - m2()");
    }
}
package l2;

public class c1 {
    public void m1() {
        System.out.println("l2: c1 - m1()");
    }

    public void m2() {
        System.out.println("l2: c1 - m2()");
    }
}
import l1.c1 as L1C1; // Import l1.c1 with alias
import l2.c1 as L2C1; // Import l2.c1 with alias

public class Main {
    public static void main(String[] args) {
        // Access methods from l1.c1
        L1C1 obj1 = new L1C1(); // Fully qualified name for l1.c1
        obj1.m1();
        obj1.m2();

        // Access methods from l2.c1
        L2C1 obj2 = new L2C1(); // Fully qualified name for l2.c1
        obj2.m1();
        obj2.m2();

        // Access static variables from l1.c1
        System.out.println("Static var1 from l1.c1: " + L1C1.var1);
        System.out.println("Static var2 from l1.c1: " + L1C1.var2);
    }
}
