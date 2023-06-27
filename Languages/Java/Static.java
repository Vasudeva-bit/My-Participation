public class Main {
    static int y = 8;
    int x = 10;
    public static void main(String args[]) {
        // System.out.println(x); // error is raised
        System.out.println(y); // no error
        // to access the x, the x must be a static variable
    }
}
// to access a non-static variable, an object is mandatory intermediate
// the above point is valid to access the variable inside the same class or in other classes without inheritence
// static varaible can be accessed either creating a new object or by using the class name
// no access modifiers or specfiers for local variables

public class nonMain {
    static int x;
    int y = 7; // this variable can be called inside usign this keyword or class object
    public static void main(String args[]) {
        Main obj = new Main();
        int x = 10;
        System.out.println(x);
        System.out.println(obj.x);
        // System.out.println(Main.x);
        // System.out.println(this.y); // no error if the method we are in is non staic else this raises error
        nonMain ob = new nonMain(); // no error
        System.out.println(ob.y);
        // System.out.println(y); // error (non staic inside static)
        System.out.println(x); // prints the local x, if there is no local x, then the x in the global scope
        // is printed since the variable x is static
    }
}