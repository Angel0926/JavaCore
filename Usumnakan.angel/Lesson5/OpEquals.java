package Lesson5;

public class OpEquals {
    public static void main(String args[]) {
        int а = 1;
        int b = 2;
        int c = 3;
        а += 5;
        b *= 4;
        c += а * b;
        c %= 6;
        System.out.println("a =" + а);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
    }
}