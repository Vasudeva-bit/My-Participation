import java.io.*;
import java.util.*;
class UnexpectedTrouserSizeException extends Exception {
    UnexpectedTrouserSizeException(String message) {
        super(message);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        double val = scan.nextDouble();
        if(val != (double)(int)val) {
            System.out.println("invalid input");
            return;
        }
        if(val <= 18.0 || val >= 45.0) {
            try {
                throw new UnexpectedTrouserSizeException("the demanded size is out of stock");
            }
            catch(UnexpectedTrouserSizeException omse) {
                System.out.println("the demanded size is out of stock");
            }
        }
        else {
            System.out.println("try and shop");
        }
    }
}