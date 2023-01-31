import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int count(int n) {
        if(n == 0)
            return 1;
        int c = 0;
        while(n > 0) {
            n /= 10;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(count(n));
    }
}