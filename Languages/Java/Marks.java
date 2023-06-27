import java.util.*;
import java.lang.*;
public class Marks {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int nS = 4;
        int nSub = 5;
        int []marTots =  new int[4];
        // The same question can be done using the nested array
        // The syntax of the nested array is 
        // int [][]arr = new int[][]; // the # rows are to be specified, # cols is optional
        for(int i=0;i<nS;i++) {
            int sum = 0;
            for(int j=0;j<nSub;j++) {
                sum += scan.nextInt();
            }
            marTots[i] = sum;
        }
        int i = 1;
        for(var val: marTots) {
            System.out.println("Marks of student "+(i++)+": "+val);
        }
    }
}