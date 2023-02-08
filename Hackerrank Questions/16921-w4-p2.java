import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n <= 0) {
            System.out.println("Invalid Array Size");
            return;
        }
        int big1 = scan.nextInt();
        if(big1 <= 0) {
            System.out.println("Invalid Array Elements");
            return;
        }
        int big2 = scan.nextInt();
        if(big2 <= 0) {
            System.out.println("Invalid Array Elements");
            return;
        }
        if(big1 <= big2) {
            int tmp = big1;
            big1 = big2;
            big2 = big1;
        }
        if(n == 2)
            System.out.println(big2);
        for(int i=2;i<n;i++) {
            int val;
            val = scan.nextInt();
            if(val <= 0) {
                System.out.println("Invalid Array Elements");
                return;
            }
            if(val >= big1) {
                big2 = big1;
                big1 = val;
            }
            else if(val >= big2) {
                big2 = val;
            }
        }
        System.out.println(big2);
    }
}