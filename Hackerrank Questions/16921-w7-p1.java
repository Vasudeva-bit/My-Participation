import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        if(str1.length()<=2) {
            System.out.println("Invalid Input");
            return;
        }
        String str2 = scan.nextLine();
        if(str2.length()<=2) {
            System.out.println("Invalid Input");
            return;
        }
        if(str1.length() != str2.length()) {
            System.out.println("NOT ANAGRAM");
            return;
        }
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        int n = charStr1.length;
        for(int i=0;i<n;i++) {
            if(charStr1[i]!=charStr2[i]) {
                System.out.println("NOT ANAGRAM");
                return;
            }
        }
        System.out.println("ANAGRAM");
    }
}