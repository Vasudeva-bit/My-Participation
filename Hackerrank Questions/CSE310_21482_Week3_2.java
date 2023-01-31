import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String one, two, three;
        one = scan.nextLine();
        one = one.trim();
        two = scan.nextLine();
        two = two.trim();
        three = scan.nextLine();
        three = three.trim();
        if(one.length() == two.length() && two.length() == three.length()) {
            System.out.println(-1);
            return;
        }
        System.out.println(Math.max(Math.max(one.length(), two.length()),three.length()));       
    }
}