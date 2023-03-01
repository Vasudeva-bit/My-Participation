import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int countA = 101;
        int countP = 101;
        for(int i=0;i<n;i++) {
            String name = scan.nextLine();
            name += scan.nextLine();
            char ch;
            ch = scan.next().charAt(0);
            if(ch == 'P') {
                System.out.println("P"+countP++);
            }
            else {
                System.out.println("A"+countA++);
            }
            name = scan.nextLine();
        }
    }
}