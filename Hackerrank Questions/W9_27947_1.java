import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++) {
            int val = scan.nextInt();
            if(val != 1 && val != 2) {
                System.out.println("Invalid Input");
                return;
            }
            if(val == 1)
                count++;
            if(val == 2) {
                if(count <= 0) {
                    System.out.println("Invalid Purchase");
                    return;
                }
                count--;
            }
            arr[i] = val;
        }
        System.out.println("Valid Purchase");
        
    }
}