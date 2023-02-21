import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int[] bubbleSort(int[] a) {
        for(int i=0;i<10;i++) {
            for(int j=0;j<(10-i-1);j++) {
                if(a[j] < a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0;i<10;i++) {
            a[i] = scan.nextInt();
        }
        a = bubbleSort(a);
        for(int val: a) {
            System.out.print(val+" ");
        }
    }
}