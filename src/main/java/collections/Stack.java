package collections;

public class Stack<T> {

    private T head;
    private Stack<T> reference;

    public boolean empty() {
        return head == null;
    }

    public void push(T object) {
        reference.reference = getReference();
        head = object;
    }

    public T pop() {
        T result = head;
        head = getReference().getHead();
        reference = getReference().getReference();
        return result;
    }

    public T peek() {
        return head;
    }

    private T getHead() {
        return head;
    }

    private Stack<T> getReference() {
        return reference;
    }
}