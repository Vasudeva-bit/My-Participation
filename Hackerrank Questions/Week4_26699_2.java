import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next().substring(0,2));
        if(n < 0 || n > 20) {
            System.out.println("Invalid size of array");
            return;
        }
        char ch;
        for(int i=0;i<n;i++) {
            try{
                ch = scan.next().charAt(0);
                System.out.print(ch+" ");
                if(ch >= 65 && ch <= 90)
                    System.out.print((char)((int)ch+32)+" ");
            }
            catch(Exception e) {}
        }
    }
}