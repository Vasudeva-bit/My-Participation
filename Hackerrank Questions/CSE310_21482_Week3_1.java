import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        char c = scan.next().charAt(0);
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == c)
                count++;
        }
        System.out.println(count);
    }
}