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
        if(n == 1) {
            System.out.println("Not Prime Number");
            System.exit(0);
        }
        for(int i=2;i*i<=n;i++) {
            if(n%i == 0) {
                
                System.out.println("Not Prime Number");
                System.exit(0);
            }
        }
        System.out.println("Prime Number");
    }
}