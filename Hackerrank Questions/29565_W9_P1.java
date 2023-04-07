import java.lang.*;
import java.io.*;
import java.util.*;
@FunctionalInterface
interface InterFace {
    boolean isPalindrome(String str);
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        InterFace IF = (String s) -> {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            boolean flag = s.equals(sb.toString());
            System.out.println(sb);
            return flag;
        };
        System.out.println(IF.isPalindrome(str));
    }
}