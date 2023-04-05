import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int l = 0, r = s.length()-1;
        int count = 0;
        while(l <= r) {
            if(s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            }
            else if(count == 0 && s.charAt(l) == s.charAt(r-1)) {
                l++;
                r-=2;
                count = 1;
            }
            else if(count == 0 && s.charAt(l-1) == s.charAt(r)) {
                l+=2;
                r--;
                count = 1;
            }
            else {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}