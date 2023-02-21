import java.io.*;
import java.util.*;

class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return 3.14 * radius * radius;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n < 1) {
            System.out.println("Invalid Input");
            return;
        }
        Circle arr[] = new Circle[n];
        for(int i=0;i<n-1;i++) {
            double val = scan.nextDouble();
            if(val < 0)
                val = 0.0;
            arr[i] = new Circle(val);
            val = arr[i].getArea();
            if(val > 30.0)
                System.out.printf("%.4f",val);
        }
    }
}