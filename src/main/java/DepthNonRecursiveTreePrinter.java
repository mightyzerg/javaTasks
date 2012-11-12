import java.util.Deque;
import java.util.LinkedList;

/**
 * User: aborovyk
 * Date: 11/11/12
 */
public class DepthNonRecursiveTreePrinter implements TreePrinter {
    @Override
    public void print(Comment root) {
        System.out.println(root.getText());

        Deque<Comment> queue = new LinkedList<Comment>();

        queue.add(root);

        root.setVisited(true);

        System.out.println(root.getText());

        while (!queue.isEmpty()) {

            Comment comment = queue.peekFirst();

            boolean isRepliedCommentVisited = true;
            Comment repliedComment = null;
            int i = 0;

            if (comment.getRepliedComments() != null) {
                while (isRepliedCommentVisited && i < comment.getRepliedComments().size()) {
                    repliedComment = comment.getRepliedComments().get(i);
                    if (!repliedComment.isVisited()) {
                        isRepliedCommentVisited = false;
                    }
                    i++;
                }
            }

            if (repliedComment != null && !isRepliedCommentVisited) {
                repliedComment.setVisited(true);
                System.out.println(repliedComment.getText());
                queue.addFirst(repliedComment);
            } else {
                queue.pop();
            }


        }
    }
}
