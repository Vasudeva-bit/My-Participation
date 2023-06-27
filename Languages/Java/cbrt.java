import java.util.*;
import java.io.*;
import java.lang.*;
public class cbrt {
    public static void main(String args[]) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int rt = (int)Math.cbrt(n);
        if(rt * rt * rt == n)
            System.out.println("True");
        else
            System.out.println("False");    
    }
}