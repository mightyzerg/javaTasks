package collections;

public class Stack<T> {

    Element head;

    public boolean empty() {
        return head == null;
    }

    public void push(T object) {
        Element element = createElement(object);
        element.nextElement = head;
        head = element;
    }

    public T pop() {
        T result = null;
        if (!empty()) {
            result = head.value;
            if (head.nextElement != null) {
                head = head.nextElement;
            } else {
                head = null;
            }
        }
        return result;
    }

    public T peek() {
        return empty() ? null : head.value;
    }

    private Element createElement(T value) {
        Element element = new Element();
        element.value = value;
        element.nextElement = null;
        return element;
    }

    public class Element {
        public T value;
        public Element nextElement;

        @Override
        public int hashCode() {
            return value.hashCode() + nextElement.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            boolean result;
            if (obj == null || getClass() != obj.getClass()) {
                result = false;
            } else {
                Element element = (Element) obj;
                result = value.equals(element.value) && nextElement.equals(element.nextElement);
            }
            return result;
        }
    }
}
