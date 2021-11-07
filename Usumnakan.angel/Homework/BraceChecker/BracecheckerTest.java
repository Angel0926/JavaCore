package Homework.BraceChecker;


public class BracecheckerTest {
    public static void main(String[] args) {
        String block;
        String Text = "Hello (from) {Java]";
        BraceChecker braceChecker = new BraceChecker(Text);
        braceChecker.check();
    }
}
