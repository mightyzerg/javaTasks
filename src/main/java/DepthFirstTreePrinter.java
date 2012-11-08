public class DepthFirstTreePrinter implements TreePrinter {

    @Override
    public void print(Comment root) {

        System.out.println(root.getText());

        if (root.getRepliedComments() != null) {
            for (Comment comment : root.getRepliedComments()) {
                print(comment);
            }
        }
    }
}
