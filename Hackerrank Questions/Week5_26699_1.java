import java.io.*;
import java.util.*;

public class Solution {

    public static void add(int a, int b) {
        System.out.println(a+b);
    }
    public static void add(String a, String b) {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch(choice) {
            case 1: {
                int a = scan.nextInt();
                int b = scan.nextInt();
                add(a, b);
                break;
            }
            case 2: {
                String a = scan.next();
                String b = scan.next();
                add(a, b);
                break;
            }
            default: {
                System.out.println("ERROR");
                return;
            } 
        }
    }
}