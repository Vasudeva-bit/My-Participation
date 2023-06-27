import java.io.*;
import java.util.*;
import java.lang.*;

public class Sample {
    public static void main(String args[]) {
        // ArrayList<Integer> arr = new ArrayList();
        ArrayList<Integer> arr = new ArrayList();

        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            arr.add(scan.nextInt());
        }
        ListIterator itr = arr.listIterator(); // return type is 
        Object nums[] = arr.toArray();
        // for(int i=0;i<nums.length;i++) {
        //     System.out.println(nums[i]);
        // }
        System.out.println("--------------------------------");
        // while(itr.hasNext()) {
        //     int val = (int)itr.next();
        //     if(val == 0) {
        //         itr.remove();
        //     }
        //     else
        //         System.out.println(val);
        // }
        while(itr.hasNext()) {
            int val = (int)itr.next();
            if(val == 10) {
                itr.add(20);
            }
        }
        itr = arr.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
// Iterable is a interface
// An interface inheriting a interface is done using the keyword extends