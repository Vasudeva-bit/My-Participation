import java.math.*;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str1, str2;
        str1 = scan.next();
        str2 = scan.next();
        str1 = str1.trim();
        str2 = str2.trim();
        if(str1.length() > 10 && str1.length() < 20 && str2.length() > 10 && str2.length() < 20) {
            BigInteger one = new BigInteger(str1);
            BigInteger two = new BigInteger(str2);
            BigInteger three = one.add(two);
            System.out.println(three);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}