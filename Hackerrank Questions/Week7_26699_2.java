import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int idx = 0;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String out = "";
        boolean flag = true;
        for(int i=0;i<text.length();i++) {
            char ch = text.charAt(idx);
            if(text.charAt(i) == ' ') {
                if(ch >= 97 && ch <= 122)
                    out += (char)(ch-32);
                else
                    out += ch;
                out += text.substring(idx+1, i+1);
                idx = i+1;
                flag = false;
            }
        }
        if(flag) {
            System.out.println("ERROR");
            return;
        }
        out += text.substring(idx);
        System.out.println(out);
    }
}