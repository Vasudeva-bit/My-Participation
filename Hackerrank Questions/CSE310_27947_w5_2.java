import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        if(n <= 200.0 || n > 4000.0) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.format("%.2f", n*0.75);
        System.out.format(" %.2f", n*0.25);
    }
}