import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        if(n > 7) {
            System.out.println("Invalid");
            return;
        }
        float avg = 0;
        int sub;
        for(int i=0;i<n;i++) {
            avg += scan.nextInt();
        }
        avg /= n;
        if(avg <= 40)
            System.out.println("D");
        else if(avg <= 59)
            System.out.println("C");
        else if(avg <= 69)
            System.out.println("B");
        else if(avg <= 89)
            System.out.println("A");
        else
            System.out.println("A+");
    }
}