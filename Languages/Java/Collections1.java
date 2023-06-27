import java.util.ArrayList;
import java.lang.Integer;
import java.util.*;

public class Collections1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);

        ListIterator<Integer> li1 = numbers.listIterator();
        boolean flag = false;
        while (li1.hasNext()) {
            Integer current = li1.next();
            if(current == 10 && !flag) {
                li1.previous();
                li1.add(20);
                li1.next();
                flag = true;
            } else {
                flag = false;
            }
        }
        System.out.println(numbers);
    }
}