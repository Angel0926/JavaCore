package Homework.BraceChecker;

import java.util.Scanner;

public class BracecheckerTest {
    public static void main(String[] args) {

        BraceChecker braceChecker = new BraceChecker("Hello {from] {Java}");
        braceChecker.check();
    }
}
