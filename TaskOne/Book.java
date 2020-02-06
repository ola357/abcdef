package abcdef.TaskOne;

public class Book {
    private String authorName;
    private  String title;

    public Book(String title, String authorName ) {
        this.title=title;
        this.authorName=authorName;
 }
    public String getAuthorName(){
        return authorName;
    }
    public String getTitle(){
        return title;
    }
    /** 
    @Override
    public String toString(){

    }
    */
}