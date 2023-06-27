import java.util.*;
import java.lang.*;

public class MDArr {
    public static void main(String args[]) {
        int[][] marks = new int[4][];
        int n;
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            System.out.println("How many subjects hava "+ (i+1)+" studied");
            n = scan.nextInt();
            int[] c = new int[n];
            System.out.println("Enter marks for "+(i+1)+" in "+n+" subjects");
            for(int j=0;j<n;j++) {
                c[j] = scan.nextInt();
            }
            marks[i] = c;
        }
        int i=0;
        for(var stu: marks) {
            System.out.print((++i)+". ");
            for(var mark: stu) {
                System.out.print(mark+" ");
            }
            System.out.println();
        }
    }
}