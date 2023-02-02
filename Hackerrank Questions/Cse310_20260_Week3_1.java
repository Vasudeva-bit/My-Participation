import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        if(n <= 0)
            System.out.println("Invalid Input");
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("&");
            }   
            System.out.println();
        }
    }
}