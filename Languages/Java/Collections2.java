import java.util.*;
class Collections2 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(10);
        numbers.add(10);
        numbers.add(15);

        ListIterator<Integer> lit = numbers.listIterator();
        while(lit.hasNext()) {
            if(lit.next().equals(10)){
                lit.previous();
                lit.add(20);
                lit.next();
            }
        }
        System.out.println(numbers);
    }
}
