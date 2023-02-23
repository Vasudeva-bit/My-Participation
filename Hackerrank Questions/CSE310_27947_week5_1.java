import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int primes[] = {2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47};
        int n = scan.nextInt();
        if(n > 50 || n < 10) {
            System.out.println("Invalid Input");
            return;
        }
        for(int i=0;i<primes.length;i++) {
            if(n%primes[i] == 0)
                System.out.print(primes[i]+" ");
        }
    }
}