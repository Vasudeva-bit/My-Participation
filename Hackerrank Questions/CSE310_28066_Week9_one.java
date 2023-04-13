import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int choice = scan.nextInt();
        if(choice >= 1 && choice <= 4) {
            if(choice == 1) {
                System.out.println(a+b);
            }
            else if(choice == 2) {
                System.out.println(a-b);
            }
            else if(choice == 3) {
                System.out.println(a*b);
            }
            else {
                System.out.println(a/b);
            }
        }
        else {
            System.out.println("Invalid");
            return;
        }
    }
}