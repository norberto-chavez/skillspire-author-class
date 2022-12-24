import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//    ArrayList<String> bookCollection = new ArrayList<>();
//    bookCollection.add("Flying");
    Author author = new Author();
    author.setAuthorName("Norberto");
    author.setAuthorNameBookCollection("Flying");
    author.setAuthorNameBookCollection("Testing");
    author.setAuthorNameBookCollection("Wow");

    author.getAuthorName();
    author.getAuthorNameBookCollection();


    }
}