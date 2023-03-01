import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String text = scan.nextLine();
        for(int i=0;i<text.length();i++) {
            if(text.charAt(i) == '.') count++;
        }
        System.out.println(count);
    }
}