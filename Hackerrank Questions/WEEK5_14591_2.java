import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a <= 10 || a >= 1000 || b <= 10 || a >= 1000) {
            System.out.print("Invalid Input");
            return;
        }
        if(a > b)
            System.out.print("true");
        else
            System.out.print("false");
    }
}