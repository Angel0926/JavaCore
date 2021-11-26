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
                return books[i];
            }
        }
        return null;
    }

    public void searchBookByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(email)) {
                System.out.println(books[i]);
            }
        }
    }

    public void deleteByAuthor(String email) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getAuthor().getEmail().equals(email)) {
                for (int j = i + 1; j < size; j++) {
                    books[j - 1] = books[j];
                }
                size--;

            }
        }
    }


    public int countBookByAuthor(String keyword) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().equals(keyword)) {
                count++;
            }
        }
        return count;
    }


    public void deleteBook(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                delete(i);
                System.out.println("Book has been deleted");
            }
        }
    }


    private void delete(int index) {
        for (int i = index + 1; i < size; i++) {
            books[i - 1] = books[i];

        }
        size--;


    }


}


