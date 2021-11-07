package Homework.BraceChecker;

public class Stack {
    private static int size;
    private static char[] array=new char[10];
    private char value;

    public Stack() {
        size = -1;
    }

    public static void push(char value) {
        if (size == array.length) {
            System.out.println("stack-ի ավարտ");
        } else {
            array[size = size + 1] = value;
        }
    }

    public char pop() {
        if (size < 0) {
            System.out.println("stack-ը դատարկ է");
            return 0;
        } else {
            return array[size++];
        }
    }
}
