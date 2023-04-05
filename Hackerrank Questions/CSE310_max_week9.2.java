import java.io.*;
import java.util.*;
@FunctionalInterface
interface Validator {
    void find(Person p[]);
}
class Person {
    int age;
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n < 1) {
            System.out.println("Invalid input");
            return;
        }
        Person p[] = new Person[n];
        for(int i=0;i<n;i++) {
            int age = scan.nextInt();
            if(age < 0)
                age = 18;
            p[i] = new Person();
            p[i].age = age;
        }
        Validator v = (Person per[])->{
            int count = 0;
            for(int i=0;i<per.length;i++) {
                if(p[i].age > 25)
                    count++;
            }
            System.out.println(count);
        };
        v.find(p);
    }
}