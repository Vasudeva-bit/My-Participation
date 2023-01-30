import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x,y;
        x = scan.nextInt();
        y = scan.nextInt();
        if(x < 0 || y < 0) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else 
            System.out.println(x+"-"+y);
    }
}