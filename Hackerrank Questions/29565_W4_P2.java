import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n;
        n = scan.nextInt();
        for(int i=0;i<n;i++) {
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }
}