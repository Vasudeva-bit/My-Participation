import java.io.*;
import java.util.*;
class OnlyMenzShoppingException extends Exception {
    OnlyMenzShoppingException(String message) {
        super(message);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String interest = scan.next();
        if(interest.equals("No")) {
            try {
                throw new OnlyMenzShoppingException("intersted only in menz shopping");
            }
            catch(OnlyMenzShoppingException omse) {
                System.out.println("intersted only in menz shopping");
            }
        }
        else if(interest.equals("Yes")) {
            System.out.println("welcome to ladies or kids section");
        }
        else {
            System.out.println("invalid input");
        }
    }
}