import java.io.*;
import java.util.*;

public class Solution {
    public static void sumOddNumbers() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        String[] val = scan.nextLine().trim().split(" ");
        for(String str: val) {
            int n = Integer.parseInt(str);
            if(n > 400 || n < 20) {
                System.out.println("Invalid Input");
                return;
            }
            if(n%2 == 1) 
                sum += n;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        sumOddNumbers();
    }
}