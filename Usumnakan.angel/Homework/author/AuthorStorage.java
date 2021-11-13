package Homework.author;


public class AuthorStorage {
    private Author[] autarray = new Author[10];

    private int size = 0;

    public void add(Author author) {
        if (autarray.length == size) {
            extend();
        }
        autarray[size++] = author;
    }


    private void extend() {
        Author[] result = new Author[autarray.length + 10];
        for (int i = 0; i < autarray.length; i++) {
            result[i] = autarray[i];
        }
        autarray = result;
    }


    public Author getByIndex(int index) {
        if (index < 0 || index > autarray.length - 1)
            System.out.println("no index");
        return autarray[index];
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(autarray[i] + " ");
        }
    }


}




