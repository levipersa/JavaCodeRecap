package fundamentals.coderecap.streams.students;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AppForStudent {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();

        Set<String> books = new HashSet<>();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        books.add("Book5");

        Set<String> booksForStudent2 = new HashSet<>();
        books.add("Book3");
        books.add("Book5");
        books.add("Book7");
        books.add("Book8");
        books.add("Book9");

        student1.setBooks(books);
        student2.setBooks(books);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        //SET OF SET
//        Set<String> filteredBooks = students.stream().map(t -> t.getBooks()).collect(Collectors.toSet());

        //Mapam de la o lista de studenti la o lista de book-uri
        students.stream().map(t -> t.getBooks())
                //Mapam la o lista de carti
                .flatMap(b -> b.stream())
                //Colectam ca si Set pentru a fi unice
                .collect(Collectors.toSet())
                //Parcurgem setul si le afisam prin forEach
                .forEach(s -> System.out.println(s));




    }
}
