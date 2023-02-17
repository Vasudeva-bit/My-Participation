import java.io.*;
import java.util.*;

public class Student {
    static Scanner scan = new Scanner(System.in);
    Student(String s1) {
        System.out.println(s1+"\nUnknown");
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String name = scan.next();
        Student ob = new Student(name);
    }
}