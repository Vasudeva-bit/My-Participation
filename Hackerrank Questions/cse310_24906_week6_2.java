import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String out = "";
        for(int i=0;i<text.length();i++) {
            char ch = text.charAt(i);;
            if(ch == ' ') 
                out += '#';
            else if(ch >= 97 && ch <= 122)
                out += (char)(ch-32);
            else
                out += ch;
        }
        System.out.println(out);
    }
}