import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n <= 20 || n >= 400) {
            System.out.println("Invalid Input");
            return;
        }
        if(n%6 == 0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}