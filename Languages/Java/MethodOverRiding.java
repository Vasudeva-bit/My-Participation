import java.util.*;
import java.lang.*;
class MethodOverRiding {
    public void drive(double x, int y) {
        System.out.println("First");
    }
}
class Child extends MethodOverRiding {
    public void drive(int x, double y) {System.out.println("Second");}
    public static void main(String args[]) {
        // MethodOverRiding p = new Child(); // O/P: First
        MethodOverRiding p = new MethodOverRiding(); // O/P: First
        p.drive(3, 5);
    }
}