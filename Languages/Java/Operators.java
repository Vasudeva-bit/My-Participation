public class main {
    public static void main(String args[]) {
        int age = 20;
        byte x = 5;
        System.out.println(~x);
        if(age >= 1 && age <= 100) // if the first condition is false, then the second condition is not executed, hence called the short-circuit operator
            System.out.println("Logical/Short-circuit &&");
        if(age >= 1 & age <= 100) // though the first condition is false, the second condition is executed
            System.out.println("Bitwise &");
        float f = 3.14; // gives error, since the floating point data by default is double
        double d = 3.14; // no error
        float f1 = 3.14f;
        float f2 = 3.15f;
        int out = (int)(f1 + f2);
        System.out.println(out);
    }
}