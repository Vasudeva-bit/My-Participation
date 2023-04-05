import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if(s.length() <= 3) {
            System.out.println("Invalid");
            return;
        }
        char ch = scan.next().charAt(0);
        int count = 0;
        int idx = -2;
        while(true) {
            idx = s.indexOf(ch, idx+1);
            if(idx == -1)
                break;
            count++;
        }
        System.out.println(count);
    }
}