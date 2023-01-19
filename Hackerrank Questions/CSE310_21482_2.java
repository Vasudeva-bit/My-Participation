import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int rt = (int)Math.sqrt(n);
        if(rt * rt == n)
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");
    }
}