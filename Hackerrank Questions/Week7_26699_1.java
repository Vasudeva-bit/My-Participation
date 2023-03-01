import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        word1 = word1.substring(0, word1.length()-4);
        if(word1.length() < 3) {
            System.out.println("ERROR");
            return;
        }
        String word2 = scan.nextLine();
        int n = word2.length()-1;
        boolean flag = true;
        for(int i=0;i<3;i++) {
            if(word1.charAt(i) != word2.charAt(n-i)) {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("GREAT");
        else
            System.out.println("TRY NEXT TIME");
    }
}