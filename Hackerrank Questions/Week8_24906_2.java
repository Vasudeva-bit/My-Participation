import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        float f1 = scan.nextFloat();
        float f2 = scan.nextFloat();
        if(f2 == 0.0) {
            System.out.println("Infinity");
        }
        else {
            System.out.println(f1/f2);
        }
    }
}