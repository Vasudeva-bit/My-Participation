import java.util.*;
import java.lang.*;
public class Main {
    void calPercentage(int m[]) {
        float avg = 0;
        for(var x:m) {
            avg += x;
        }
        System.out.println("The average is: "+(avg/m.length))
    }
    public static void main(String args[]) {
        int marks[] = new int[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        for(int i=0;i<marks.length;i++) {
            marks[i] = scan.nextInt();
        }
        // for each loop syntax
        System.out.println("The marks entered are: ");
        for(var x:marks) {
            System.out.println(x);
        }
        Main ob = new Main();
        m.calPercentage(marks); // the array is not copied to the calPercentage m array but the variable m just points
        // to the space memory.
    }
}