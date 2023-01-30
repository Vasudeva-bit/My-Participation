import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if(x >= y) {
            System.out.println("NO OUTPUT");
            return;
        }
        int sum = 0;
        for(int i=x+1;i<y;i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}