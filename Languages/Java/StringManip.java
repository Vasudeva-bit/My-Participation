import java.util.*;
import java.lang.*;
class StringManip {
    public static void main(String[] args) {
        System.out.println("He".compareTo("Hey"));
        String name = "Vasudeva";
        System.out.println(name.indexOf('a', name.indexOf('a')+1));
        // int indexOf(int ch, int startIndex)
        // int lastIndexOf(int ch, int startIndex)
        // int indexOf(String str, int startIndex)
        // int lastIndexOf(String str, int startIndex)
        String s = "Now is the time for all good men " + "to come to the aid of their country";
        System.out.println(s.lastIndexOf('t')); 
    }
}