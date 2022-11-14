package hw1;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
