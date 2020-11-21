package fundamentals.coderecap.collections;

public class AppCollection {

    public static void main(String[] args) {

        BookStore bookStore = new BookStore();

        bookStore.initWithDefaultValue();

        //for (Book book : bookStore.getBooks()) {

          //  System.out.println(book);
        //}



//        System.out.println(bookStore.getBooks().descendingSet());

        bookStore.initBooksByTypeWithDefaultValue();

        System.out.println(bookStore.getBooksByType());



    }
}
