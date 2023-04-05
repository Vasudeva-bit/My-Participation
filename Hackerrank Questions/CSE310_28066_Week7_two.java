import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
            return true;
        return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String one = scan.next();
        String two = scan.next();
        one = one.toLowerCase();
        two = two.toLowerCase();
        for(int i=0;i<one.length();i++) {
            if(isVowel(one.charAt(i)))
                count++;
        }
        for(int i=0;i<two.length();i++) {
            if(isVowel(two.charAt(i)))
                count++;
        }
        System.out.println(count);
    }
}