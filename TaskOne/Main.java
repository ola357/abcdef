package abcdef.TaskOne;

public class Main {
    public static void main(String[] args){
        Library l = new Library();
        Book b = new Book("Java", "Olaoluwa");
        System.out.println(b.toString());
        l.addBook(b);
        l.printAllBooks();
        l.addBook(b);
        l.printAllBooks();
    }
}