import java.util.*;
import java.lang.*;
public class countLower {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = scan.nextInt();
        if(n <= 0 or n > 20) {
            System.out.println("Invalid array size");
            return;
        }
        int count = 0;
        char[] alphaNum = new char[n];
        for(int i=0;i<n;i++) {
            char ch = scan.next().charAt(0);
            alphaNum[i] = ch;
            if(ch >= 97 and ch <= 122)
                count++;
        }
        System.out.println("The counter of lowercase is: "+ count);
    }
}