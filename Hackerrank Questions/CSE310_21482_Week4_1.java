import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum;
        for(int i=0;i<n;i++) {
            sum = 0;
            for(int j=0;j<7;j++) {
                sum += scan.nextInt();
            }
            if(sum == 56)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}