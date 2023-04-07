import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
@FunctionalInterface
interface Test
{
    int count(int [] arr);
}

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
        }
        Test IF = (arr)-> {
            int count = 0;
            for(int i=0;i<arr.length;i++) {
                if(arr[i] == 2 || arr[i] == 3 || arr[i] == 5 || arr[i] == 7 || arr[i] == 11 || arr[i] == 13 || arr[i] == 17 || arr[i] == 19)
                    count++;
            }
            return count;
        };
        System.out.print(IF.count(a)+" ");
        IF = (arr)-> {
            int count = 0;
            for(int i=0;i<arr.length;i++) {
                if(arr[i]%10 == 0)
                    count++;
            }
            return count;
        };
        System.out.println(IF.count(a));
    }
}