import java.io.*;
import java.util.*;

public class Text_Complex {
    static Scanner scan = new Scanner(System.in);
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static int fa, fb;
    public static void Mul_complex(Complex ob1, Complex ob2) {
        fa = ob1.a*ob2.a - ob1.b*ob2.b;
        fb = ob1.a*ob2.b + ob1.b*ob2.a;
    }
    public static void Display() {
        System.out.println(fa+"+"+fb+"i");
    }
    public static void main(String[] args) throws IOException {
        String[] s1;
        String[] s2;
        s1 = buffer.readLine().split(" ");
        s2 = buffer.readLine().split(" ");
        int b1, b2;
        int a1 = Integer.parseInt(s1[0]);
        if(s1.length < 2)
            b1 = 0;
        else
            b1 = Integer.parseInt(s1[1]);
        int a2 = Integer.parseInt(s2[0]);
        if(s2.length < 2)
            b2 = 0;
        else
            b2 = Integer.parseInt(s2[1]);
        Complex ob1 = new Complex(a1, b1);
        Complex ob2 = new Complex(a2, b2);
        Mul_complex(ob1, ob2);
        Display();
    }
}
class Complex {
    int a, b;
    Complex() {
        a=0;
        b=0;
    }
    Complex(int x, int y) {
        a = x;
        b = y;
    }
}