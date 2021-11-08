package Homework.BraceChecker;

import java.util.Scanner;

public class BracecheckerTest {
    public static void main(String[] args) {

    /*   Scanner sc = new Scanner(System.in);
        String text = sc.next();*/
        BraceChecker braceChecker = new BraceChecker("Hello {from] {Java}" );
        braceChecker.check();
    }
}
