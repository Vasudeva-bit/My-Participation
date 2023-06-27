import java.util.*;
import java.io.*;
class InvalidSizeException extends Exception {
    String message;
    InvalidSizeException(String message) {
        this.message = message;
        System.out.println("Calling the get Message from Exception's constructor");
        System.out.println(getMessage());
    }
    public String getMessage() {
        return message;
    }
}
class InvalidException extends Exception {
    InvalidException(String message) {
        super(message);
    }
}
class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of subjects: ");
        int n = scan.nextInt();
        try {
            if(n < 1 || n > 5) {
                throw new InvalidSizeException("The 'n' i.e., no of subjects should be between 0 and 6");
            }
        }
        catch(InvalidSizeException ise) {
            System.out.println("InvalidSizeException Above!");
            return;
        }
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter the "+(i+1)+" subject: ");
            int val = scan.nextInt();
            try {
                if(val < 0) {
                    throw new InvalidException("Mark should be greaer than 0");
                }
            }
            catch(InvalidException ie) {
                System.out.println("InvalidException "+ie.getMessage());
                return;
            }
            a[i] = val;
        }
    }
}
// Exception are two types: checked (can be written within the try block) eg: Exception & User-defined Exception
// and unchecked (can be written without the try block) eg: ArithmeticException ()
/*                      Throwable
                            |
                        Exception
                        /   |   \
                      ...  ...  InvalidSizeException
                                (has the getMessage() is a
                                predefined function, used to
                                display the error message using super())
*/