import collections.Deque;

public class CollectionsCheckerTest extends junit.framework.TestCase {

    private Deque<Integer> actualDeque = new Deque<Integer>();
    private Deque<Integer> expectedDeque = new Deque<Integer>();

    public void testPeek() throws Exception {
        expectedDeque.offerLast(20);
        actualDeque.offerLast(20);
        assertTrue(actualDeque.peekLast().equals(expectedDeque.peekLast()));
    }

    public void testOffer() throws Exception {
        expectedDeque.offerFirst(20);
        expectedDeque.offerFirst(15);
        actualDeque.offerLast(15);
        actualDeque.offerLast(20);
        assertTrue(actualDeque.peekFirst().equals(expectedDeque.peekFirst()));
    }

    public void testPoll() throws Exception {
        expectedDeque.offerLast(20);
        expectedDeque.offerLast(15);
        expectedDeque.pollFirst();
        actualDeque.offerLast(15);
        assertTrue(actualDeque.peekFirst().equals(expectedDeque.peekFirst()));
    }
}
