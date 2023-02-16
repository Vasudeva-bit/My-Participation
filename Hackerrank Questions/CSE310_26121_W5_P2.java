import java.io.*;
import java.util.*;

public class Test_Volumes {
    static Scanner scan = new Scanner(System.in);
    public static void Volume(int r) {
        System.out.println((4/3)*3.14*r*r*r);
    }
    public static void Volume(int w, int d) {
        System.out.println((3.14)*w*w*d);
    }
    public static void Volume(int h, int l, int b) {
        System.out.println(h*l*b);
    }
    public static void terminate() {
        System.out.println("invalid input");
        return;
    }
    public static void Display() {
        int r = scan.nextInt();
        if(r < 1) 
            terminate();
        Volume(r);
        int w = scan.nextInt();
        if(w < 1) {
            terminate();
        }
        int d = scan.nextInt();
        if(d < 1)
            terminate();
        Volume(w, d);
        int h = scan.nextInt();
        if(h < 1) 
            terminate();
        int l = scan.nextInt();
        if(l < 1) 
            terminate();
        int b = scan.nextInt();
        Volume(h, l, b);
    }
    public static void main(String[] args) {
        Display();
    }
}