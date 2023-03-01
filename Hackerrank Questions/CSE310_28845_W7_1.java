import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int n = scan.nextInt();
        if(n > 10) {
            System.out.println("Invalid Input");
            return;
        }
        int idx = 0;
        int count = 0;
        text = text.trim();
        int i;
        for(i=0;i<text.length();i++) {
            if(text.charAt(i) == ' ') {
                if(i-idx == n)
                    count++;
                idx = i+1;
            }
        }
        if(i-idx == n) count++;
        System.out.println(count);
    }
}