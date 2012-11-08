import java.util.LinkedList;
import java.util.List;

public class Comment {

    private String subject;

    private String text;

    private List<Comment> repliedComments;

    private boolean isRootComment;

    private boolean isVisited;

    public static class Builder {
        private final String text;

        private String subject = "";
        private List<Comment> repliedComments = null;
        private boolean isRootComment = false;
        private boolean isVisited = false;

        public Builder(String text) {
            this.text = text;
        }

        public Builder subject(String value) {
            subject = value;
            return this;
        }

        public Builder repliedComments(List<Comment> list) {
            repliedComments = list;
            return this;
        }

        public Builder rootComment(boolean value) {
            isRootComment = value;
            return this;
        }

        public Builder visited(boolean value) {
            isVisited =  value;
            return this;
        }

        public Comment build() {
            return new Comment(this);
        }
    }
    
    private Comment (Builder builder) {
        text = builder.text;
        subject = builder.subject;
        repliedComments = builder.repliedComments;
        isVisited = builder.isVisited;
        isRootComment = builder.isRootComment;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public List<Comment> getRepliedComments() {
        return repliedComments;
    }

    public boolean isRootComment() {
        return isRootComment;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
