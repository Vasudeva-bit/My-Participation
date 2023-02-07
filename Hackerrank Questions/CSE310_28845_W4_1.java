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
        if(n > 10) {
            System.out.println("Invalid");
            return;
        }
        int small1 = scan.nextInt();
        int small2 = scan.nextInt();
        if(small1 < small2) {
            int tmp = small1;
            small1 = small2;
            small2 = small1;
        }
        if(n == 2)
            System.out.println(small2);
        for(int i=2;i<n;i++) {
            int val;
            val = scan.nextInt();
            if(val <= small1) {
                small2 = small1;
                small1 = val;
            }
            else if(val <= small2) {
                small2 = val;
            }
        }
        System.out.println(small2);
    }
}