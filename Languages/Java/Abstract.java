import java.util.*;
import java.lang.*;
abstract class Abstract {
    abstract public void drive(int x, double y);
}
class Child extends Abstract {
    public void drive(int x, double y) {System.out.println("Abstract method drive is redifined!");}
    public static void main(String args[]) {
        // Abstract ab = new Abstract(); // error
        Child ob = new Child();
        ob.drive(6, 7.0);
    }
}