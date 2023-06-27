import java.util.*;
import java.lang.*;

public class Methods {
    Scanner scan = new Scanner(System.in);
    int balanace;
    public static void main(String args[]) {
        System.out.println("Enter the initial balance in the bank");
        balanace = scan.nextInt();
        char ch;
        System.out.println(("Enter the code: 1. withdraw and 2. deposit"));
        ch = scan.next().charAt(0);
        while(ch != 'q') {
            if(ch == '1') {
                System.out.println(withdrawn());
            }
            else if(ch == '2') {
                System.out.println(deposit());
            }
            else
                break;
        }
    }
    int withdrawal() {
        System.out.println("Enter the amt req to be withdrawn");
        int need = scan.nextInt();
        return balanace-need;
    }
    int deposit() {
        System.out.println("Enter the amt to be deposited");
        int amt = scan.nextInt();
        balanace += amt;
        return amt;
    }
}