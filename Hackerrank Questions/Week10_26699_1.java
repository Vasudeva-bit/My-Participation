import java.io.*;
import java.util.*;

class MyCalculator {
    long power(int a, int b) {
        if(a < 0 || b < 0) {
            System.out.println("java.lang.Exception: n or p should not be negative.");
        }
        else if(a == 0 && b == 0) {
            System.out.println("java.lang.Exception: n and p should not be zero.");
        }
        else
            System.out.println((int)(Math.pow(a, b)));
        return 0;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = 5;
        while(n!=0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            MyCalculator calc = new MyCalculator();
            calc.power(a, b);
            n--;
        }
    }
}