import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        if(n < 0) {
            System.out.println("Invalid Input");
            return;
        }
        for(int i=0;i<=n;i++) {
            System.out.println(i);
        }
        System.out.println("Games End");
    }
}