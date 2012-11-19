package collections;

public class Deque<T> {

    private Element head;
    private Element tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void offerLast(T object) {
        Element element = createElement(object);
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            element.prevElement = tail;
            tail.nextElement = element;
            tail = element;
        }

    }

    public void offerFirst(T object) {
        Element element = createElement(object);
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            element.nextElement = head;
            head.prevElement = element;
            head = element;
        }
    }

    public void pollLast() {
        if (!isEmpty()) {
            tail = tail.prevElement;
        }
    }

    public void pollFirst() {
        if (!isEmpty()) {
            head = head.nextElement;
        }
    }

    public T peekLast() {
        return isEmpty() ? null : tail.value;
    }

    public T peekFirst() {
        return isEmpty() ? null : head.value;
    }

    public Element createElement(T value) {
        Element element = new Element();
        element.value = value;
        element.nextElement = null;
        element.prevElement = null;
        return element;
    }

    private class Element {
        public T value;
        public Element nextElement;
        public Element prevElement;

        @Override
        public int hashCode() {
            return value.hashCode() + nextElement.hashCode() + prevElement.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            boolean result;
            if (obj == null || getClass() != obj.getClass()) {
                result = false;
            } else {
                Element element = (Element) obj;
                result = value.equals(element.value) && nextElement.equals(element.nextElement)
                        && prevElement.equals(element.prevElement);
            }
            return result;
        }
    }
}