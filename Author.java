import java.util.ArrayList;

public class Author {
    private String authorName = "";
    private ArrayList<String> authorNameBookCollection = new ArrayList<String>();

    public Author(String authorName, ArrayList<String> authorNameBookCollection) {
        this.authorName = authorName;
        this.authorNameBookCollection = authorNameBookCollection;
    }

    public Author() {

    }

    public String getAuthorName() {
       System.out.println(authorName);
        return null;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void getAuthorNameBookCollection() {
        System.out.println(authorNameBookCollection.toString());
    }

    public void setAuthorNameBookCollection(String s) {
        authorNameBookCollection.add(s);

    }
}