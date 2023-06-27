import java.util.*;
import java.lang.*;

public class ParentChildConstructor{
    public static void main(String args[]) {
        Child c = new Child(5);
    }
}

public class Parent {
    Parent() {
        System.out.println("Parent without param");
    }
    Parent(int a) {
       System.out.println("Parent with param");
    }
}
public class Child extends Parent{
    Child(int a) {
        super(0);
        System.out.println("Child");
    }
}