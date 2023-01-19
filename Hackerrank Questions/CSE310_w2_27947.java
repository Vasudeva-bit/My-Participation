import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int Seven = 0;
        int SFeven = 0;
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            int n;
            n = scan.nextInt();
            if(n > 13 || n < 1) {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            if(n%2 == 0)
                Seven++;
        }
        for(int i=0;i<4;i++) {
            int n;
            n = scan.nextInt();
            if(n > 13 || n < 1) {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            if(n%2 == 0)
                SFeven++;
        }
        Seven = (Seven > (4-Seven))?Seven:(4-Seven);
        SFeven = (SFeven > (4-SFeven))?SFeven:(4-SFeven);
        if(Seven > SFeven)
            System.out.println("Saurav Won");
        else if(SFeven > Seven)
            System.out.println("Saurav Lost");
        else
            System.out.println("Tie");
    }
}