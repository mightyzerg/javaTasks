package collections;

import java.util.Vector;

/**
 * User: Compaq
 * Date: 12.11.12
 */
public class Stack<T> extends Vector<T> {

    public boolean empty() {
        return size() == 0;
    }

    public void push(T object) {
        add(object);
    }

    public T pop() {
        return remove(size()-1);
    }

    public T peek() {
        return get(0);
    }
}