import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeInterface {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.addFirst(1);
        dq.offerFirst(2);
        dq.addFirst(3);
        dq.offerLast(4);
        dq.addLast(5);
        dq.addLast(6);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addFirst(null);
        ll.offerFirst(1);
        ll.addFirst(2);
        ll.offerFirst(3);
        ll.addLast(4);
        ll.offerLast(5);
        ll.addLast(6);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
    }
}