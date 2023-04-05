import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toLowerCase();
        s = s.trim();
        s = " "+s+" ";
        String word = (" "+scan.next()+" ").toLowerCase();
        int count = 0;
        int idx = -2;
        while(true) {
            if(idx == -2)
                idx = s.indexOf(word);
            else
                idx = s.indexOf(word, idx+1);
            if(idx != -1)
                count++;
            else
                break;
        }
        System.out.println(count);
    }
}