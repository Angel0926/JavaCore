package Homework.practiceHomework.Author;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public Book searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
        return null;
    }




    public void searchBooksByAuthor(String keyemail) {
        for (int i = 0; i <size ; i++) {
 if(books[i].getAuthor().getEmail().equals(keyemail)) {
     System.out.println(books[i]);
 }
        }

    }

    public void countBookByAuthor(String keyemail) {
        int count=0;
        for (int i = 0; i <size ; i++) {
            if(books[i].getAuthor().getEmail().equals(keyemail))
                count++;

        }
        System.out.println(count);
    }

}


