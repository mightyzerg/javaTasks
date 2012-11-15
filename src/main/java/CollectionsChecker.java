import collections.Stack;

public class CollectionsChecker {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        if (stack.empty()) {
            stack.push(15);
            stack.push(17);
            stack.push(13);
            System.out.println(stack.peek());
            stack.pop();
            System.out.println(stack.peek());
        }
    }
}
