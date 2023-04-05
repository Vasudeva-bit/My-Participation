import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n < 2) {
            System.out.println("Invalid");
            return;
        }
        String str[] = new String[n];
        for(int i=0;i<n;i++) {
            str[i] = scan.next();
        }
        Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
        for(int i=0;i<n;i++) {
            System.out.println(str[i]);
        }
     }
}