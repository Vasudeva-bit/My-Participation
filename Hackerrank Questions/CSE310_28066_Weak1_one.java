import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x, y, z;
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        float out = (float)(x+y+z)/3;
        String s = String.format("%.2f",out);
        System.out.println(s.substring(0, s.length()-1));
    }
}