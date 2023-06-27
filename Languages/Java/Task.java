import java.io.*;
import java.util.*;
import java.lang.*;

public class Task {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the no of students: ");
        n = scan.nextInt();
        ArrayList<String> arr = new ArrayList();
        for(int i=0;i<n;i++) {
            System.out.println("Enter a name: ");
            String name = scan.next();
            if(name.charAt(0) < 65 || name.charAt(0) > 90) {
                System.out.println("Enter the name with first letter being the capital one");
                n++;
                continue;
            }
            boolean flag = false;
            if(!(name.length() >= 3 && name.length() < 30)) {
                System.out.println("Enter the name with length between 3 and 30");
                n++;
                continue;
            }
            for(int j=1;j<name.length();j++) {
                char ch = name.charAt(j);
                if(!(ch == ' ' || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                System.out.println("Enter the name containing only alphabets");
                n++;
                continue;
            }
            arr.add(name);
        }
        System.out.println(arr);
    }
}