package abcdef.TaskOne;

public class Teacher extends Person {
    private String name;
    private String role= "teacher";

    public Teacher(String name) {
        super(name, "teacher");
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public BookRequest requestABook(String title, String authorName){

    return new BookRequest(new Book(title, authorName), this);
    }
}