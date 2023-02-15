import java.io.*;
import java.util.*;

public class Main {
    public static void show(String Name, int regNum) {
        System.out.println(Name+","+regNum);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        choice = scan.nextInt();
        if(choice == 1) {
            String Name = scan.next();
            int regNum = scan.nextInt();
            while(regNum <= 0) {
                Name = scan.next();
                regNum = scan.nextInt();
            }
            show(Name, regNum);
        }
        else if(choice == 2) {
            show("null", 0);
        }
        else{
            System.out.println("Wrong Choice");
        }
    }
}