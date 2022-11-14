package hw1;

public class Main {
    public static void main(String[] args) {
        Post post=new Post(1,1,"title","body");

        System.out.println(post);
        post.setUserId(20);
        System.out.println(post);
        System.out.println(post.getUserId());

        Comment comment=new Comment(1,2,"name","email","body");

        System.out.println(comment);
        comment.setBody("newBody");
        System.out.println(comment);
        System.out.println(comment.getId());
    }
}
