import java.util.*;
import java.lang.*;
public class insertArray {
    public static void main(String args[]) {
        float[] temp = new float[8];
        System.out.println("Enter temperature for 7 days: ");
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<7;i++) 
            temp[i] = scan.nextFloat();
        System.out.println("Enter the day, to insert the new temperature");
        int pos = scan.nextInt()-1;
        for(int i=7;i<=pos;i++) {
            temp[i] = temp[i-1];
        }
        System.out.println("Enter the new value to be inserted at the postion "+pos);
        temp[pos] = scan.nextInt();
        System.out.println("The updated values in the temperature array are: ");
        for(var val: temp) {
            System.out.println(val);
        }
        // BigDecimal is class type data type, it is used to store the decimal values with additional functionalities
    }
}