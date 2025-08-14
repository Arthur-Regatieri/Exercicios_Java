import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        DateTimeFormatter frmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post( LocalDateTime.parse("21/06/2018 13:05:44", frmt1),
         "Traveling to New Zealand",
          "I'm going to visit this wonderful country!",
          12);

          p1.addComments(c1);
          p1.addComments(c2);

          System.out.println(p1);
    }
}
