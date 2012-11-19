import collections.Deque;
import collections.Stack;

public class CollectionsChecker {

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<Integer>();
        System.out.println(deque.peekLast());
        deque.offerLast(15);
        deque.offerLast(17);
        deque.offerFirst(13);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        deque.pollFirst();
        System.out.println(deque.peekFirst());
        deque.pollLast();
        System.out.println(deque.peekLast());
        deque.pollFirst();
        System.out.println(deque.peekLast());
    }
}
