import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.endsWith("@gmail.com") && s.charAt(0) != '.' && s.charAt(s.length()-1) != '.')
            System.out.println("valid\n"+s.indexOf('@'));
        else
            System.out.println("invalid\n"+s.indexOf('@'));
    }
}