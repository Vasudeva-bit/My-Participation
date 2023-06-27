import java.util.*;
import java.lang.*;
public static void main(String args[]) {
    int balance;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter initial balance");
    balance = scan.nextInt();
    int ch;
    // Question like call center menu can easily be dealt with do while loop instead of while loop, for loop
    do {
        System.out.println("Press: \n1. To deposit\n2. To withdraw\n3. Check balance\n4. Exit");
        ch = scan.nextInt();
        if(ch == 1) {
            // deposit
        }
        else if(ch == 2) {
            // withdraw
        }
        else if(ch == 3) {
            // check balance
        }
    } while(ch != 4);
}