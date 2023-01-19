import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum = 0;
        int cond[] = {20, 20, 15, 5};
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            int n = scan.nextInt();
            if(n < cond[i] && n > 0)
                sum += n;
            // else {
            //     System.out.println("Invalid Input");
            //     System.exit(0);
            // }
        }
        System.out.println(sum);
    }
}