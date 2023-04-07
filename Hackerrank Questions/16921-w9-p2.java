import java.io.*;
import java.util.*;
@FunctionalInterface
interface InterFace {
    boolean test(Student t);
}
class Student {
    String name, department;
    int rollNo;
}
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n <= 1) {
            System.out.println("Invalid");
            return;
        }
        InterFace IF = (s)-> {
            if(s.department.equals("CSE"))
                return true;
            return false;
        };
        Student s[] = new Student[n];
        for(int i=0;i<n;i++) {
            s[i] = new Student();
            s[i].name = scan.next();
            s[i].rollNo = scan.nextInt();
            s[i].department = scan.next();
            if(IF.test(s[i]))
                System.out.println(s[i].rollNo);
        }
    }
}