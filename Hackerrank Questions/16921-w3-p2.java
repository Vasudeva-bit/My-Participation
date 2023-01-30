import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        if(r <= 0) {
            System.out.println("Invalid Rows");
            return;
        }
        for(int i=r;i>0;i--) {
            for(int j=0;j<i;j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}