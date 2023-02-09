import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String day = scan.next();
        switch(day) {
            case "Monday":
                System.out.println("8:30 5:30");
                break;
            case "Tuesday":
                System.out.println("8:30 5:30");
                break;
            case "Wednesday":
                System.out.println("8:30 5:30");
                break;
            case "Thursday":
                System.out.println("8:30 5:30");
                break;
            case "Friday":
                System.out.println("8:30 5:30");
                break;
            case "Saturday":
                System.out.println("9:30 4:30");
                break;
            default:
                System.out.println("Library is closed");
                break;
        }
    }
}