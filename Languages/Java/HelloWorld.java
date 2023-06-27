import java.util.Scanner; // import Scanner class
public class Main {
    public static void main(String args[]) {
        Code.printer();
    }
}
public class Code {
    public static void printer() {
        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values X, Y: ");
        x = scan.nextInt();
        y = scan.nextInt();
        for(int i=x;i<=y;i++) {
            System.out.println(i);
        }
        System.out.println(Math.abs(x) + " " + Math.abs(y));
    }
}