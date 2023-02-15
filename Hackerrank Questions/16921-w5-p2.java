import java.io.*;
import java.util.*;

public class Integer1 {
    public static int add(int[] a) {
        int sum = 0;
        for(int val: a) {
            sum += val;
        }
        return sum;
    }
    public static int mul(int[] a) {
        int mul = 1;
        for(int val: a) {
            mul *= val;
        }
        return mul;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n < 0) {
            System.out.println("Invalid Array Size");
            return;
        }
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
        }
        int choice;
        choice = scan.nextInt();
        if(choice == 1) {
            System.out.println(add(a));
        }
        else if(choice == 2) {
            System.out.println(mul(a));
        }
        else{
            System.out.println("Wrong Choice");
        }
    }
}