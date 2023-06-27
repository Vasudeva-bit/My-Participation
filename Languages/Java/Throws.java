import java.lang.*;
class Throws {
    // Throwable is the interface the Exception class in java implements
    public static void main(String[] args) {
        int n = 0, m = 0;
        try {
            n = Integer.parseInt(args[0]);
            try {
                m = Integer.parseInt(args[1]);
                // If the array index out of bounds exception is raised here due to fewer command line args,
                // the exception is hanlded by the outer catch block for ArrayIndexOutOfBounds
                System.out.println(n/m);
            }
            catch(ArithmeticException ae) {
                System.out.println("Invalid division");
            }
        }
        catch(NegativeArraySizeException nase) {
            System.out.println("Enter the command line arguments while running");
        }
        catch(NumberFormatException nfe) { 
            // Might be raised due to error while parsing the command line arguments into integer type
            System.out.println("The command line arguments should be integers only");
        }
        catch(ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("#(command line arguments) are not appropriate");
        }
        catch(Exception e) {
            System.out.println("Some error has occurred");
        }
        finally { // Not an exception handler
            System.out.println("Executed any way");
            // Set of code to be alwayed executed irrespective of the exception being raised or not
            // Close files, data base connection etc.
        }
        // Structure of exception handling:
        // 1. try + catch
        // 2. try + finally
        // 3. try + catch + finally
        int posCount = 0;
        int negCount = 0;
        int zerCount = 0;
        if(n > 0 && m > 0){
            posCount += Math.abs(n-m)-1;
        }
        else if((n > 0 && m < 0) || (n < 0 && m > 0)) {
            zerCount++;
            posCount += Math.abs(n)-1;
            negCount += Math.abs(m)-1;
        }
        else if(n < 0 && m < 0) {
            negCount += Math.abs(n-m)-1;
        }
        System.out.println(""+posCount+" "+negCount+" "+zerCount);
        // 1. NegativeArraySzieException
        // 2. NumberFormatException (while parsing from command line arguments)
        // 3. InputMismatchException (if the input is taken from scanner class and inappropriate type of data is given)

        // Nested catch and try blocks to handle the exceptions expected in the try block or catch block (alternative code)
        
        // Use of the throw keyword
        try {
            throw new ArithmeticException("Throwing a fake ArithmeticException"); // this line throws a exception of type arithmetic using the object of Arithmetic
        // Exception class
        }
        catch(ArithmeticException ae) {
            System.out.println("Raised the exception AE using throw");
        }
    }
}