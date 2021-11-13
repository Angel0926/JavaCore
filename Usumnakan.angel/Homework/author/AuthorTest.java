package Homework.author;


import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many authors are there?");
        int a = scanner.nextInt();
       AuthorStorage AS= new AuthorStorage();
        for (int i = 0; i < a; i++) {
            Author author = new Author();
            System.out.println("NAME:");
            author.setName(scanner.next());
            System.out.println("SURNAME:");
            author.setSurname(scanner.next());
            System.out.println("EMAIL:");
            author.setEmail(scanner.next());
            System.out.println("AGE:");
            author.setAge(scanner.nextInt());
            System.out.println("GENDER:");
            author.setGender(scanner.next());
         AS.add(author);
        }
     AS.print();
    }

}
