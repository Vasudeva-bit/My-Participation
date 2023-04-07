import java.io.*;
import java.util.*;
@FunctionalInterface
interface InterFace {
    int countVowels(String s);
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        
        InterFace IF = (String s) -> {
            int count = 0;
            for(int i=0;i<s.length();i++) {
                char ch = s.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    count++;
            }
            return count;
        };
        System.out.println(IF.countVowels(str));
    }
}