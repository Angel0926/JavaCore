package Homework;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j >= 0; j--) {
                if (j > i)

                    System.out.print(" ");

                else

                    System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < 4; j++) {
                if (j < i - 1)
                    System.out.print(" ");
                else
                    System.out.print("*");

            }

            System.out.println();
        }
    }
}



