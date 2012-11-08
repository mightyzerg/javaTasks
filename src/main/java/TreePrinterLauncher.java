import java.util.LinkedList;
import java.util.List;

public class TreePrinterLauncher {
    public static void main(String[] args) {
        TreePrinter breadthTreePrinter = new BreadthFirstTreePrinter();
        TreePrinter depthTreePrinter = new DepthFirstTreePrinter();

        Comment comment = buildTree();

        System.out.println("Depth-first tree printer:");
        depthTreePrinter.print(comment);

        System.out.print("\nBreadth-first tree printer:");
        breadthTreePrinter.print(comment);


    }

    private static Comment buildTree() {
        Comment comment1_2_2 = new Comment.Builder("Level 3. 5th comment").build();
        Comment comment1_2_1 = new Comment.Builder("Level 3. 4th comment").build();
        List<Comment> commentsList1_2 = new LinkedList<Comment>();
        commentsList1_2.add(comment1_2_1);
        commentsList1_2.add(comment1_2_2);
        Comment comment1_2 = new Comment.Builder("Level 2. 2nd comment").repliedComments(commentsList1_2).build();

        Comment comment1_1_3 = new Comment.Builder("Level 3. 3rd comment").build();
        Comment comment1_1_2 = new Comment.Builder("Level 3. 2nd comment").build();
        Comment comment1_1_1 = new Comment.Builder("Level 3. 1st comment").build();
        List<Comment> commentsList1_1 = new LinkedList<Comment>();
        commentsList1_1.add(comment1_1_1);
        commentsList1_1.add(comment1_1_2);
        commentsList1_1.add(comment1_1_3);
        Comment comment1_1 = new Comment.Builder("Level 2. 1st comment").repliedComments(commentsList1_1).build();

        List<Comment> commentsList1 = new LinkedList<Comment>();
        commentsList1.add(comment1_1);
        commentsList1.add(comment1_2);

        return new Comment.Builder("").rootComment(true).repliedComments(commentsList1).build();
    }
}
