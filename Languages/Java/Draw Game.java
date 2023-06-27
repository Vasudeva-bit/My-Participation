import java.util.*;
import java.lang.*;
public class Game {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number guessed by the user: ");
        n = scan.nextInt();
        int count = 0;
        int []arr = new int[20];
        for(int i=0;i<20;i++) {
            arr[i] = (int) Math.ceil(Math.random()+20); // Math.random generates a value between 0 and 1. Adding a const x gives
            // the random value between 0 and x
            if(arr[i] == n)
                count++;
        }
        if(count != 0) {
            System.out.println("You are lucky");
        }
        else {
            System.out.println("Try your luck next time");
        }
    }
}