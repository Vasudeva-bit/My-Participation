import java.util.*;
import java.lang.*;

public class Parent {
    final void display() {
        System.out.println("Parent Display");
    }
}

public class Child extends Parent {
    void display() {
        System.out.println("Child display");
    }
}

public class Main {
    public static void main(String args[]) {
        Child c = new Child();
        c.display(); // compile time error since the child class display attempted to re-define the parent class display, which was declared to be final.
    }
}