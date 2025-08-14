import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private static DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime date;
    private String title, content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post() {
        
    }

    public Post(LocalDateTime date, String title, String content, Integer likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComments(Comment comments){
        this.comments.add(comments);
    }

    public void removeComments(Comment comments){
        this.comments.remove(comments);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append("Likes - ");
        sb.append(frmt1.format(date) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment x : comments) {
            sb.append(x.getText() + "\n");
            
        }
        return sb.toString();
        
    }




}
