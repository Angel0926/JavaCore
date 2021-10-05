package Homework;

public class FiurePainter1 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 4; i > 0; i--) {
            for (int j = 4; j > i - 1; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }


    }
}