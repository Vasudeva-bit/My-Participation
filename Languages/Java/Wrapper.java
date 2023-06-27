import java.util.*;
import java.lang.*;
public class Wrapper {
    public static void main(String args[]) {
        int []a = {1, 2, 1};
        int []b = {1, 2, 1};
        int []c = {1, 3, 1};
        System.out.println("Checking weather a and b are equal "+a.equals(b));
        System.out.println("Checking weather a and c are equal "+a.equals(c));
        // The output is false in the both cases, since they are both pointing to different memeory locations even thought the value in the variables is same

        String s = "Vasudeva";
        String str = "Vasudeva";
        String str1 = "Deva";
        System.out.println(s.equals(str));
        System.out.println(s.equals(str1));
    }
}