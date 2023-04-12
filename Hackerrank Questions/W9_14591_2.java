import java.io.*;
import java.util.*;

class InvalidRightAngleTriangle extends Exception{
    public InvalidRightAngleTriangle(String s) {
        super(s);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a > 20 || b > 20 || c > 20) {
            System.out.println("Invalid Input");
            return;
        }
        a *= a;
        b *= b;
        c *= c;
        try {
            if(a+b == c || b == c+a || a == b+c) {
                System.out.println("Valid Triangle");
            }
            else {
                throw new InvalidRightAngleTriangle("Not a right angled triangle!");
            }
        }
        catch(InvalidRightAngleTriangle irat) {
            System.out.println("Invalid Triangle");
        }
    }
}