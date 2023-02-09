import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n <=2 || n >= 30) {
            System.out.println("Invalid Input");
            return;
        }
        int prev = 0;
        for(int i=0;i<n;i++) {
            int val;
            val = scan.nextInt();
            if(val != prev)
                System.out.print(val+" ");
            prev = val;
        }
    }
}