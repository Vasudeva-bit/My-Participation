import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a!=0)
        {
            System.out.println("without birth no certificate");
            System.exit(0);
        }
        if(b!=1)
        {
            System.out.println("invalid input");
            System.exit(0);
        }
        else
        {
            System.out.println("Certificate Issued");
        }
    }
}