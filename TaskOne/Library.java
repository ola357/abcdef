package abcdef.TaskOne;

import java.util.*;

public class Library {
    private Map<Book, Integer> library = new HashMap<>();
    private Queue <BookRequest> request = new PriorityQueue<>();

    public void addBook(Book b) {
        if (library.containsKey(b)) {
            int num = library.get(b);
            library.replace(b, ++num);

        } else {
            library.put(b, 1);
        }

    }

    public void printAllBooks(){
        for(Book b : library.keySet()){
            System.out.println(b.toString() +": "+ library.get(b));
        }
    }
    public void collectBookRequest(BookRequest br){
        request.add(br);
    }
    public String processBookRequest(){
        return null;
    }

}