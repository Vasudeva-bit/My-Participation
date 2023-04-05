import java.io.*;
import java.util.*;
@FunctionalInterface
interface Validator {
    boolean Valid(String s, int n);
}
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = scan.nextInt();
        if(n < 1) {
            System.out.println("Invalid input");
            return;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Validator v = (String str, int m) -> (str.length() > m);
        System.out.println((v.Valid(s, n))?"Valid string":"Invalid string");
    }
}