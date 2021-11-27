package Praktik.AuthorBook;

import java.util.Scanner;

public class AuthorBookTest {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "8";
    private static final String COUNT_BOOKS_BY_AUTHOR = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";
    private static final String CHANGE_BOOK_TITLE = "12";
    private static final String DELETE_BOOK = "13";
    private static final String DELETE_BY_AUTHOR = "14";
    private static final String DELETE_AUTHOR = "15";


    public static void main(String[] args) {

        authorStorage.add(new Author("poxos", "poxosyan", 22, "poxos@mail.com", "male"));
        authorStorage.add(new Author("poxosuhi", "poxosyan", 23, "poxosuhi@mail.com", "female"));
        authorStorage.add(new Author("petros", "petrosyan", 25, "petros@mail.com", "male"));
        Author author = new Author("petros", "petrosyan", 25, "petros@mail.com", "male");
        bookStorage.add(new Book("sgexam", "sdfgg", 5, 5, author));
        author = new Author("Poxos", "Poxosyan", 18, "poxos@mail.com", "male");
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("samvel", "sdgf", 9, 5, author));
        bookStorage.add(new Book("karen", "asdgasd", 54, 74, author));
        bookStorage.add(new Book("simon", "sdffseg", 845, 85, author));


        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBookByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                case CHANGE_BOOK_TITLE:
                    changeBookTitle();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                case DELETE_BY_AUTHOR:
                    deleteByAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void deleteByAuthor() {
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        bookStorage.deleteByAuthor(email);
    }

    private static void deleteAuthor() {
        System.out.println("please input book's email");
        String email = scanner.nextLine();
        authorStorage.deleteAuthor(email);
    }

    private static void deleteBook() {
        System.out.println("please input book's title");
        String title = scanner.nextLine();
        bookStorage.deleteBook(title);
    }

    private static void changeBookTitle() {
        System.out.println("PLase input book's title");
        String title = scanner.nextLine();
        Book book = bookStorage.searchByTitle(title);
        if (book != null) {
            System.out.println("Please input new title");
            String title1 = scanner.nextLine();
            book.setTitle(title1);
            System.out.println("thanks!");
        } else {
            System.out.println("Invalid Title");
            changeBookTitle();
        }
    }

    private static void changeBookAuthor() {
        System.out.println("please input book's title");
        String title = scanner.nextLine();
        Book book = bookStorage.searchByTitle(title);
        if (book != null) {
            System.out.println("please input author's email");
            String email = scanner.nextLine();
            Author author = authorStorage.getByEmail(email);
            if (author != null) {
                book.setAuthor(author);
                System.out.println("Thank you! Author has been changed");
            } else {
                book.setAuthor(addAuthor());
            }
        } else {
            System.out.println("invalid title");
            changeBookAuthor();
        }
    }

    private static void changeAuthor() {
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input author's name");
            String name = scanner.nextLine();
            author.setName(name);
            System.out.println("please input author's surname");
            String surname = scanner.nextLine();
            author.setSurname(surname);
            System.out.println("please input author's gender");
            String gender = scanner.nextLine();
            author.setGender(gender);
            System.out.println("please input author's age");
            int age = Integer.parseInt(scanner.nextLine());
            author.setAge(age);
            System.out.println("Thank you! Author's data  has been changed");
        } else {
            System.out.println("invalid email");
            changeAuthor();
        }
    }


    private static void countBookByAuthor() {
        System.out.println("please input author's email");
        String keyword = scanner.nextLine();
        Author author = authorStorage.getByEmail(keyword);
        int c = bookStorage.countBookByAuthor(keyword);
        System.out.println(author.getName() + " has " + c + " books");
        bookStorage.countBookByAuthor(keyword);
    }

    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByTitle(keyword);
    }

    private static void searchBooksByAuthor() {
        System.out.println("please input author's email");
        String keyword = scanner.nextLine();
        bookStorage.searchBookByAuthor(keyword);
    }

    private static void addBook() {

        System.out.println("please choose author's email or input NEW authors info");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String desc = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, desc, price, count, author);
            bookStorage.add(book);
            System.out.println("Thank you, Book was added");
        } else {
            System.out.println("Author doesn't exist.Add a new author");
            Author newAuthor = addAuthor();
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String desc = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, desc, price, count, newAuthor);
            bookStorage.add(book);
            System.out.println("Thank you, Book was added");
        }
    }


    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchAuthorByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please input " + SEARCH_BOOKS_BY_AUTHOR + " for search book by author");
        System.out.println("please input " + COUNT_BOOKS_BY_AUTHOR + " for count book by author");
        System.out.println("please input " + CHANGE_AUTHOR + " to change author");
        System.out.println("please input " + CHANGE_BOOK_AUTHOR + " to change book author");
        System.out.println("please input " + CHANGE_BOOK_TITLE + " to change book title");
        System.out.println("please input " + DELETE_BOOK + " to delete book");
        System.out.println("please input " + DELETE_BY_AUTHOR + " to delete author's book");
        System.out.println("please input " + DELETE_AUTHOR + " to delete author");
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static Author addAuthor() {
        System.out.println("please input author's name");
        String name = scanner.nextLine();
        System.out.println("please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println("please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, age, email, gender);
        if (authorStorage.getByEmail(author.getEmail()) != null) {
            System.err.println("Invalid email. Author with this email already exists");
        } else {
            authorStorage.add(author);
            System.out.println("Thank you, author was added");
        }
        return author;
    }
}
