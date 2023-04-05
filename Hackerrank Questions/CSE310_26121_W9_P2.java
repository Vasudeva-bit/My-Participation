import java.io.*;
import java.util.*;

class atm
{
    static int balance;
    int acno;
    atm(int balance)
    {
        this.balance = balance;
        
    }
    
    static void customer_details(int wt)
    {
        class transaction{
            void balance()
            {
                System.out.println(balance);
            }
            void withdraw(int wat)
            {
                if(balance<1000){System.out.println("insufficient balance");System.exit(0);}
                
                else {if(wat>balance){System.out.println("over withdraw not allow");System.exit(0);}else
                    balance -= wat;}
            }   
        }
        transaction t1 = new transaction();
            t1.withdraw(wt);
            t1.balance();
    }
    ;
    
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        atm test_atm = new atm(a);
        atm.customer_details(b);
        
    }
}