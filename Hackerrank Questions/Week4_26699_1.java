import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        float arr[] = new float[6];
        arr[0] = scan.nextFloat();
        float min = arr[0];
        int idx = 0;
        for(int i=1;i<6;i++) {
            arr[i] = scan.nextFloat();
            min = Math.min(arr[i], min);
            if(arr[idx] < arr[i])
                idx = i;
        }
        arr[idx] = min;
        for(int i=0;i<6;i++) {
            System.out.print((int)(arr[i])+" ");
        }
    }
}