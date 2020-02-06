package abcdef.TaskOne;

public class Student extends Person{
    private String name;
    private String role= "student";

    public Student(String name) {
        super(name, "student");
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