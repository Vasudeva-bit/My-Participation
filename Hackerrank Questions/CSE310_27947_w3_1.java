import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        String s = (s1.length() > s2.length())?s2:s1;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int sO1 = Occurrences(s1, ch);
            int sO2 = Occurrences(s2, ch);
            // sO1 is always smaller
            if(sO1 > sO2) {
                int tem = sO1;
                sO1 = sO2;
                sO2 = tem;
            }
            if(sO2 % sO1 != 0) {
                System.out.println("Not Similar");
                return;
            }
        }
        System.out.println("Similar");
    }
    public static int Occurrences(String s, char c) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == c)
                count++;
        }
        return count;
    }
}