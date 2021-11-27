
package Praktik.AuthorBook;

public class AuthorStorage<isFound> {
    private Author[] authors = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (authors.length == size) {
            extend();
        }
        boolean isFound = false;
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(author.getEmail())) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.err.println("Invalid mail. Author with this email already exist");
        } else {
            authors[size++] = author;
        }
    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchAuthorByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);
            }
        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }

    public void deleteAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().contains(email)) {
                deleteA(i);
                System.out.println("Author has been deleted");
            }else System.err.println("invalid author");
        }
    }

    private void deleteA(int index){
        for (int i = index + 1; i < size; i++) {
            authors[i - 1] = authors[i];
        }
        size--;
    }
}



