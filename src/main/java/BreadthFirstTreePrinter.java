import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTreePrinter implements TreePrinter {

    @Override
    public void print(Comment root) {

        System.out.println(root.getText());

        Queue<Comment> queue = new LinkedList<Comment>();

        queue.add(root);

        System.out.println(root.getText());

        while (!queue.isEmpty()) {
            Comment comment = queue.remove();

            if (comment.getRepliedComments() != null) {
                for (Comment repliedComment : comment.getRepliedComments()) {
                    if (!repliedComment.isVisited()) {
                        repliedComment.setVisited(true);
                        System.out.println(repliedComment.getText());
                        queue.add(repliedComment);
                    }
                }
            }
        }
    }
}
