import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char out = 'a';
        int max = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(!((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57))) {
                System.out.println("Invalid Input");
                return;
            }
            int count = 1;
            if(hm.containsKey(ch)) {
                count += hm.get(ch);
                hm.remove(ch);
            }
            hm.put(ch, count);
            if(count > max) {
                max = count;
                out = ch;
            }
        }
        System.out.println("Maximum occurring character is "+out);
    }
}