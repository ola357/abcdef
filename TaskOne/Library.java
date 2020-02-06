package abcdef.TaskOne;

import java.util.*;

public class Library {
    private Map<Book, Integer> library = new HashMap<>();

    public void addBook(Book b) {
        if (library.containsKey(b)) {
            int num = library.get(b);
            library.replace(b, num);

        } else {
            library.put(b, 0);
        }

    }

    public void printAllBooks(){
        for(Book b : library.keySet()){
            System.out.println(b.toString());
        }
    }

}