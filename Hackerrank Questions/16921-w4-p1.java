import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n < 0) {
            System.out.println("Invalid Array Size");
            return;
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            double val;
            val = scan.nextDouble();
            if(val < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }
            arr[i] = (int)(val);
        }
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
}