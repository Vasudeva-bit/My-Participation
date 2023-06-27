import java.util.*;
import java.lang.*;
public class StringHandling {
    public static void main(String args[]) {
        String str1 = new String();
        str1 = "Vasudeva";
        String str2 = new String(str1);
        char charray[] = {'D', 'e', 'v', 'a'};
        String str3 = new String(charray);
        byte bytearray[] = {68, 101, 118, 97};
        String str4 = new String(bytearray);
        String str5 = new String(charray, 2, 2);
        String str6 = new String(bytearray, 2, 2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str1.length());
        // charAt(), concat(), toCharArray(), 
    }
}