package Homework.author;

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

        System.arraycopy(books, 0, tmp, 0, books.length);

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
                return  books[i];
            }
        }return null;
    }
    public void searchBookByAuthor(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(keyword)) {
                System.out.println(books[i]);
            }
        }
    }
    public void countBookByAuthor(String keyword) {
        int count=0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(keyword)) {
               count++;
            }

        }System.out.println(count);
    }

}


